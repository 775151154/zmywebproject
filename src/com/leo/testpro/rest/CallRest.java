package com.leo.testpro.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.leo.mypro.vo.User;

import sun.net.www.http.HttpClient;

/**
 * ����rest�ӿ� �����ַ�ʽ
 * 
 * @author leo
 *
 */
@Component
@RequestMapping(value = "/restest")
public class CallRest {
	/**
	 * 1. HttpURLConnection ��ʽ����Restful�ӿ� ���Ѳ��ԣ�
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/do/{param}")
	public @ResponseBody String call1(@PathVariable String param) {
		try {
			String url = "http://localhost:7080/zmywebproject/rest/method/";
//			url += (param + "/xxx");
			url += param; 
			URL restServiceURL = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
			// param ����Сд��ת���� GET POST DELETE PUT
//			httpConnection.setRequestMethod(param.toUpperCase());
			httpConnection.setRequestMethod("GET");
			// httpConnection.setRequestProperty("Accept", "application/json");
			if ("post".equals(param)) {
				// ���������
				httpConnection.setDoOutput(true);
				// httpConnection.setDoInput(true);

				// ���ݲ���
				String input = "&id=" + URLEncoder.encode("abc", "UTF-8");
				input += "&name=" + URLEncoder.encode("������", "UTF-8");
				OutputStream outputStream = httpConnection.getOutputStream();
				outputStream.write(input.getBytes());
				outputStream.flush();
			}
			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException(
						"HTTP GET Request Failed with Error code : " + httpConnection.getResponseCode());
			}
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader((httpConnection.getInputStream())));
			String output;
			System.out.println("Output from Server:  \n");
			while ((output = responseBuffer.readLine()) != null) {
				System.out.println(output);
			}
			httpConnection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 2. HttpClientʵ�� ��δ���ԣ�
	 * http://blog.csdn.net/qq_34155601/article/details/70236948
	 * 
	 * @param param
	 * @return
	 */
/**
	@RequestMapping(value = "/do2/{param}")
	public @ResponseBody String call2(@PathVariable String param) {
		User user = null;
		try {
			HttpClient client = HttpClients.createDefault();
			if ("get".equals(param)) {
				HttpGet request = new HttpGet("http://localhost:8080/tao-manager-web/get/" + "������");
				request.setHeader("Accept", "application/json");
				HttpResponse response = client.execute(request);
				HttpEntity entity = response.getEntity();
				ObjectMapper mapper = new ObjectMapper();
				user = mapper.readValue(entity.getContent(), User.class);
			} else if ("post".equals(param)) {
				HttpPost request2 = new HttpPost("http://localhost:8080/tao-manager-web/post/xxx");
				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				nvps.add(new BasicNameValuePair("id", "������"));
				nvps.add(new BasicNameValuePair("name", "secret"));
				UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nvps, "GBK");
				request2.setEntity(formEntity);
				HttpResponse response2 = client.execute(request2);
				HttpEntity entity = response2.getEntity();
				ObjectMapper mapper = new ObjectMapper();
				user = mapper.readValue(entity.getContent(), User.class);
			} else if ("delete".equals(param)) {

			} else if ("put".equals(param)) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
*/
	
	/**
	 * 3. Spring��RestTemplateʵ�� ��δ���ԣ�
	 * springmvc.xml����

		<!-- ����RestTemplate -->
	    <!--Http client Factory -->
	    <bean id="httpClientFactory"
	        class="org.springframework.http.client.SimpleClientHttpRequestFactory">
	        <property name="connectTimeout" value="10000" />
	        <property name="readTimeout" value="10000" />
	    </bean>
	
	    <!--RestTemplate -->
	    <bean id="restTemplate" class="org.springframework.web.client.RestTemplate">
	        <constructor-arg ref="httpClientFactory" />
	    </bean>
	 */
/**
	@Autowired
    private RestTemplate template;

    @RequestMapping("RestTem")
    public @ResponseBody User RestTem(String method) {
        User user = null;
        //����
        if ("get".equals(method)) {
            user = template.getForObject(
                    "http://localhost:8080/tao-manager-web/get/{id}",
                    User.class, "��������");

            //getForEntity��getForObject�������ǿ��Ի�ȡ����ֵ��״̬��ͷ����Ϣ
            ResponseEntity<User> re = template.
                    getForEntity("http://localhost:8080/tao-manager-web/get/{id}",
                    User.class, "��������");
            System.out.println(re.getStatusCode());
            System.out.println(re.getBody().getUsername());

        //����
        } else if ("post".equals(method)) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("X-Auth-Token", UUID.randomUUID().toString());
            MultiValueMap<String, String> postParameters = new LinkedMultiValueMap<String, String>();
            postParameters.add("id", "������");
            postParameters.add("name", "���汾");
            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(
                    postParameters, headers);
            user = template.postForObject(
                    "http://localhost:8080/tao-manager-web/post/aaa", requestEntity,
                    User.class);
        //ɾ��
        } else if ("delete".equals(method)) {
            template.delete("http://localhost:8080/tao-manager-web/delete/{id}","aaa");
        //�޸�
        } else if ("put".equals(method)) {
            template.put("http://localhost:8080/tao-manager-web/put/{id}",null,"bbb");
        }
        return user;

    }
*/
}
