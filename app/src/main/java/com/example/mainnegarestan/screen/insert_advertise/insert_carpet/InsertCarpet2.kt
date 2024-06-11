package com.example.mainnegarestan.screen.insert_advertise.insert_carpet

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mainnegarestan.viewmodel.product.ProductViewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalPermissionsApi::class)
@Composable
fun InsertCarpet2(
    pTitle:String?,
    pCode: String?,
    pDimn: String,
    pSize: String?,
    pColor: String?,
    pDesign: String?,
    navController: NavHostController,
    viewModel: ProductViewModel = hiltViewModel(),
) {

    var ppTitle by remember { mutableStateOf(pTitle!!.replace("{", "").replace("}", "")) }
    var ppCode by remember { mutableStateOf(pCode!!.replace("{", "").replace("}", "")) }
    var pWeight by remember { mutableStateOf(TextFieldValue()) }
    var ppDimn by remember { mutableStateOf(pDimn!!.replace("{", "").replace("}", "")) }
    var ppSize by remember { mutableStateOf(pSize!!.replace("{", "").replace("}", "")) }
    var ppColor by remember { mutableStateOf(pColor!!.replace("{", "").replace("}", "")) }
    var ppDesign by remember { mutableStateOf(pDesign!!.replace("{", "").replace("}", "")) }
    var ptHeight by remember { mutableStateOf(TextFieldValue()) }
    var ptWeight by remember { mutableStateOf(TextFieldValue()) }
    var ptPood by remember { mutableStateOf(TextFieldValue()) }
    var pjTar by remember { mutableStateOf(TextFieldValue()) }
    var pjPood by remember { mutableStateOf(TextFieldValue()) }
    var pjKhab by remember { mutableStateOf(TextFieldValue()) }
    var pDesc by remember { mutableStateOf(TextFieldValue()) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }
    val context = LocalContext.current
    val bitmap = remember { mutableStateOf<Bitmap?>(null) }

    val permissionRequestLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        if (permissions[Manifest.permission.READ_EXTERNAL_STORAGE] == true &&
            permissions[Manifest.permission.WRITE_EXTERNAL_STORAGE] == true) {
            Toast.makeText(context, "Permission hale", Toast.LENGTH_SHORT).show()

        } else {
            Toast.makeText(context, "Permission denied to read/write your External storage", Toast.LENGTH_SHORT).show()
        }
    }
    val launcher = rememberLauncherForActivityResult(
        contract =
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        imageUri = uri
    }


    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    "افزودن آگهی",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }, backgroundColor = Color.Transparent)
        }
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Button(onClick = {
                if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ||
                    ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    permissionRequestLauncher.launch(arrayOf(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    ))
                    Toast.makeText(context, "Permission denied to read/write your External storage", Toast.LENGTH_SHORT).show()

                } else {
                    launcher.launch("image/*")
                }
            }) {
                imageUri?.let {
                    if (Build.VERSION.SDK_INT < 28) {
                        bitmap.value = MediaStore.Images
                            .Media.getBitmap(context.contentResolver,it)

                    } else {
                        val source = ImageDecoder
                            .createSource(context.contentResolver,it)
                        bitmap.value = ImageDecoder.decodeBitmap(source)
                    }
                    bitmap.value?.let {  btm ->
                        Image(bitmap = btm.asImageBitmap(),
                            contentDescription =null,
                            modifier = Modifier.height(200.dp).fillMaxWidth())
                    }
                }
            }
            Text(
                text = "مشخصات فنی",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(start = 10.dp, top = 5.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "تراکم عرضی",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = ptWeight,
                    onValueChange = { ptWeight = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "تراکم طولی",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = ptHeight,
                    onValueChange = { ptHeight = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "تراکم پود",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = ptPood,
                    onValueChange = { ptPood = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "جنس نخ تار",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = pjTar,
                    onValueChange = { pjTar = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "جنس نخ پود",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = pjPood,
                    onValueChange = { pjPood = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                    text = "جنس نخ خاب",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = pjKhab,
                    onValueChange = { pjKhab = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.width(200.dp)
                )
            }
            Divider(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp)
            )
            Column(
                modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = " توضیحات و اطلاعات تماس", style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedTextField(
                    value = pDesc,
                    maxLines = 5,
                    onValueChange = { pDesc = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth().height(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(end = 10.dp)) {


                Spacer(modifier = Modifier.weight(1f).padding(top = 30.dp))
                Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.height(50.dp).width(100.dp),
                    onClick = {
                        var imageFile = File(getRealPathFromURI(context,imageUri!!))
                        val imageRequestBody = imageFile.asRequestBody("image/jpeg".toMediaTypeOrNull())
                        val imagePart = MultipartBody.Part.createFormData("image", imageFile.name, imageRequestBody)
                        Log.d("TAG", "InsertCarpet2: $ppCode")
                        Log.d("TAG", "InsertCarpet2: $ppDesign")
                        Toast.makeText(context, "$ppCode", Toast.LENGTH_SHORT).show()
                        Toast.makeText(context, "$ppDesign", Toast.LENGTH_SHORT).show()
                        try{
                            viewModel.uploadCarpet(
                                title = ppTitle.toRequestBody("text/plain".toMediaTypeOrNull()),
                                category = createPartFromString("فرش"),
                                code = ppCode.toRequestBody("text/plain".toMediaTypeOrNull()),
                                weight = createPartFromString(pWeight.text),
                                dimension = ppDimn.toRequestBody("text/plain".toMediaTypeOrNull()),
                                size = ppSize.toRequestBody("text/plain".toMediaTypeOrNull()),
                                color = ppColor.toRequestBody("text/plain".toMediaTypeOrNull()),
                                shape = ppDesign.toRequestBody("text/plain".toMediaTypeOrNull()),
                                quantity = createPartFromString("quantity"),
                                visitCount = createPartFromString("visitCount")!!,
                                addDate = createPartFromString("addDate"),
                                property = createPartFromString(pDesc.text),
                                description = createPartFromString(pDesc.text),
                                price = createPartFromString("price"),
                                quality = createPartFromString("quality"),
                                density = createPartFromString("density"),
                                densityInHeight = createPartFromString(ptHeight.text),
                                densityInWidth = createPartFromString(ptWeight.text),
                                khabType = createPartFromString(pjKhab.text),
                                poodType = createPartFromString(pjPood.text),
                                tarType = createPartFromString(pjTar.text),
                                tissueLocation = createPartFromString("tissueLocation"),
                                tissueType = createPartFromString("tissueType"),
                                numcolor = createPartFromString("numcolor"),
                                image = imagePart,
                            ) { response ->
                                Log.d("TAG", "InsertCarpet2: Response - ${response.status}, ${response.message}")
                            }
                        }catch (e:Exception){
                            Log.e("TAG", "InsertCarpet2: Error occurred - ${e.message}")
                            Toast.makeText(context, "An error occurred: ${e.message}", Toast.LENGTH_LONG).show()                        }
                    }) {
                    Text("درج آگهی", style = TextStyle(Color.White, fontSize = 20.sp))
                }
            }
            Spacer(modifier = Modifier.height(100.dp))
        }
        }
}
private fun createPartFromString(value: String?): RequestBody? {
    return value?.toRequestBody("text/plain".toMediaTypeOrNull())
}

private fun getRealPathFromURI(context: Context, uri: Uri): String? {
    var result: String? = null
    val cursor: Cursor? = context.contentResolver.query(uri, null, null, null, null)
    if (cursor != null) {
        cursor.use {
            if (it.moveToFirst()) {
                val columnIndex = it.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                if (columnIndex != -1) {
                    val name = it.getString(columnIndex)
                    val file = File(context.filesDir, name)
                    context.contentResolver.openInputStream(uri)?.use { inputStream ->
                        file.outputStream().use { outputStream ->
                            inputStream.copyTo(outputStream)
                        }
                    }
                    result = file.absolutePath
                }
            }
        }
    }
    return result
}