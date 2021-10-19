package com.lichongbing.lstudyhttp.ext;

import com.lichongbing.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import lombok.Data;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Data
public class HeaderInterceptor extends BasePathMatchInterceptor {

    private String accept;

    private String contentType;

    @Override
    public Response doIntercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request newReq = request.newBuilder()
            .addHeader("Accept", accept)
            .addHeader("Content-Type", contentType)
            .build();
        return chain.proceed(newReq);
    }
}
