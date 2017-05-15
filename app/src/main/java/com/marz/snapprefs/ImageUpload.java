package com.marz.snapprefs;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

interface ImageUpload {
    @Multipart
    @POST("/upload-snap")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image);
}
