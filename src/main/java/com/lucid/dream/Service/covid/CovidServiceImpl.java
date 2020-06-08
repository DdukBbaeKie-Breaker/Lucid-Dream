package com.lucid.dream.Service.covid;

import com.lucid.dream.domain.payload.request.CovidRequest;
import com.sun.org.apache.xpath.internal.operations.String;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@Service
@AllArgsConstructor
public class CovidServiceImpl implements CovidService {

   private final CovidServiceImpl Service;

   private final String key = "RNxybYAy3dOOwBgkcV4fIGrhGSFuzC1Udcjus3AWuDWiDjuHykgFmxIeeFwScefZcSAIlctl20wG0RImcHdgeA%3D%3D";

    @Override
    public CovidRequest covidResult() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?";
            URL urls = new URL(url + key);

            URLConnection connection = urls.openConnection();




        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
