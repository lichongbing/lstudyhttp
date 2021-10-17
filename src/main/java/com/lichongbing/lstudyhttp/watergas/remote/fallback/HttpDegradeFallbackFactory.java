package com.lichongbing.lstudyhttp.watergas.remote.fallback;


import com.lichongbing.lstudyhttp.watergas.model.Token;
import com.lichongbing.lstudyhttp.watergas.model.UserRename;
import com.lichongbing.lstudyhttp.watergas.remote.HttpApi;
import com.lichongbing.lstudyhttp.watergas.result.GetTokenResult;
import com.lichongbing.lstudyhttp.watergas.result.UserRenameResult;
import com.lichongbing.retrofit.spring.boot.degrade.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author lichongbing
 * @version 1.0.0
 * @date 2021/10/12 4:44 下午
 * @description: TODO
 */
@Component
@Slf4j
public class HttpDegradeFallbackFactory implements FallbackFactory<HttpApi> {
    @Override
    public HttpApi create(Throwable cause) {
        log.error("触发熔断了! {0} {1}", cause.getMessage(), cause);
        return new HttpApi() {


            @Override
            public Call<GetTokenResult> getToken(String url, Token token) {
                return null;
            }

            @Override
            public Call<UserRenameResult> userRename(String url, UserRename userRename) {
                return null;
            }
        };
    }
}
