/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1;

import org.wso2.am.integration.clients.publisher.api.ApiCallback;
import org.wso2.am.integration.clients.publisher.api.ApiClient;
import org.wso2.am.integration.clients.publisher.api.ApiException;
import org.wso2.am.integration.clients.publisher.api.ApiResponse;
import org.wso2.am.integration.clients.publisher.api.Configuration;
import org.wso2.am.integration.clients.publisher.api.Pair;
import org.wso2.am.integration.clients.publisher.api.ProgressRequestBody;
import org.wso2.am.integration.clients.publisher.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.publisher.api.v1.dto.APIListDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportConfigurationApi {
    private ApiClient apiClient;

    public ImportConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportConfigurationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for importApisPost
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importApisPostCall(File file, String provider, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/import/apis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (provider != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("provider", provider));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call importApisPostValidateBeforeCall(File file, String provider, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling importApisPost(Async)");
        }
        

        com.squareup.okhttp.Call call = importApisPostCall(file, provider, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Imports API(s).
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @return APIListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIListDTO importApisPost(File file, String provider) throws ApiException {
        ApiResponse<APIListDTO> resp = importApisPostWithHttpInfo(file, provider);
        return resp.getData();
    }

    /**
     * Imports API(s).
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @return ApiResponse&lt;APIListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIListDTO> importApisPostWithHttpInfo(File file, String provider) throws ApiException {
        com.squareup.okhttp.Call call = importApisPostValidateBeforeCall(file, provider, null, null);
        Type localVarReturnType = new TypeToken<APIListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Imports API(s). (asynchronously)
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importApisPostAsync(File file, String provider, final ApiCallback<APIListDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = importApisPostValidateBeforeCall(file, provider, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for importApisPut
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importApisPutCall(File file, String provider, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/import/apis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (provider != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("provider", provider));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call importApisPutValidateBeforeCall(File file, String provider, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling importApisPut(Async)");
        }
        

        com.squareup.okhttp.Call call = importApisPutCall(file, provider, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Imports API(s).
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @return APIListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIListDTO importApisPut(File file, String provider) throws ApiException {
        ApiResponse<APIListDTO> resp = importApisPutWithHttpInfo(file, provider);
        return resp.getData();
    }

    /**
     * Imports API(s).
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @return ApiResponse&lt;APIListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIListDTO> importApisPutWithHttpInfo(File file, String provider) throws ApiException {
        com.squareup.okhttp.Call call = importApisPutValidateBeforeCall(file, provider, null, null);
        Type localVarReturnType = new TypeToken<APIListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Imports API(s). (asynchronously)
     * This operation can be used to import one or more existing APIs. 
     * @param file Zip archive consisting on exported api configuration  (required)
     * @param provider If defined, updates the existing provider of each API with the specified provider. This is to cater scenarios where the current API provider does not exist in the environment that the API is imported to.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importApisPutAsync(File file, String provider, final ApiCallback<APIListDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = importApisPutValidateBeforeCall(file, provider, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
