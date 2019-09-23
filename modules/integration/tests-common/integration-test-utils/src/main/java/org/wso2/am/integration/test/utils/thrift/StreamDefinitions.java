/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.wso2.am.integration.test.utils.thrift;

/**
 * this class is hold list of event stream definitions that used to published to DAS for APIM analytics
 */
public class StreamDefinitions {
    public static final String APIMGT_STATISTICS_RESPONSE_STREAM_ID = "org.wso2.apimgt.statistics.response:1.1.0";
    public static final String APIMGT_STATISTICS_DESTINATION_STREAM_ID = "org_wso2_apimgt_statistics_destination:1.0.0";
    public static final String APIMGT_STATISTICS_REQUEST_STREAM_ID = "org.wso2.apimgt.statistics.request:1.1.0";
    public static final String APIMGT_STATISTICS_EXECUTION_TIME_STREAM_ID =
            "org.wso2.apimgt.statistics.execution.time:" + "1.0.0";
    public static final String APIMGT_STATISTICS_WORKFLOW_STREAM_ID = "org.wso2.apimgt.statistics.workflow:1.0.0";
    public static final String APIMGT_STATISTICS_FAULT_STREAM_ID = "org.wso2.apimgt.statistics.fault:1.0.0";
    public static final String APIMGT_STATISTICS_THROTTLE_STREAM_ID = "org.wso2.apimgt.statistics.throttle:1.0.0";

    public static String getStreamDefinitionResponse() {
        return "{" +
                "  'name':'" +
                "org.wso2.apimgt.statistics.response" + "'," +
                "  'version':'" +
                "1.1.0" + "'," +
                "  'nickName': 'API Manager Response Data'," +
                "  'description': 'Response Data'," +
                "  'metaData':[" +
                "          {'name':'clientType','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +
                "          {'name':'consumerKey','type':'STRING'}," +
                "          {'name':'context','type':'STRING'}," +
                "          {'name':'api_version','type':'STRING'}," +
                "          {'name':'api','type':'STRING'}," +
                "          {'name':'resourcePath','type':'STRING'}," +
                "          {'name':'resourceTemplate','type':'STRING'}," +
                "          {'name':'method','type':'STRING'}," +
                "          {'name':'version','type':'STRING'}," +
                "          {'name':'response','type':'INT'}," +
                "          {'name':'responseTime','type':'LONG'}," +
                "          {'name':'serviceTime','type':'LONG'}," +
                "          {'name':'backendTime','type':'LONG'}," +
                "          {'name':'username','type':'STRING'}," +
                "          {'name':'eventTime','type':'LONG'}," +
                "          {'name':'tenantDomain','type':'STRING'}," +
                "          {'name':'hostName','type':'STRING'}," +
                "          {'name':'apiPublisherApi','type':'STRING'}," +
                "          {'name':'applicationName','type':'STRING'}," +
                "          {'name':'applicationId','type':'STRING'}," +
                "          {'name':'cacheHit','type':'BOOL'}," +
                "          {'name':'responseSize','type':'LONG'}," +
                "          {'name':'protocol','type':'STRING'}," +
                "          {'name':'responseCode','type':'INT'}," +
                "          {'name':'destination','type':'STRING'}" +
                "  ]" +
                "}";
    }

    public static String getStreamDefinitionRequest() {
        /*
          Please use this comment to track the steam changes that were done.
          Current Version -
            1.1.0
          Changes -
            1.1.0 -  Added the resourceTemplate parameter.
         */
        return "{" +
                "  'name':'" +
                "org.wso2.apimgt.statistics.request" + "'," +
                "  'version':'" +
                "1.1.0" + "'," +
                "  'nickName': 'API Manager Request Data'," +
                "  'description': 'Request Data'," +
                "  'metaData':[" +
                "          {'name':'clientType','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +
                "          {'name':'consumerKey','type':'STRING'}," +
                "          {'name':'context','type':'STRING'}," +
                "          {'name':'api_version','type':'STRING'}," +
                "          {'name':'api','type':'STRING'}," +
                "          {'name':'resourcePath','type':'STRING'}," +
                "          {'name':'resourceTemplate','type':'STRING'}," +
                "          {'name':'method','type':'STRING'}," +
                "          {'name':'version','type':'STRING'}," +
                "          {'name':'request','type':'INT'}," +
                "          {'name':'requestTime','type':'LONG'}," +
                "          {'name':'userId','type':'STRING'}," +
                "          {'name':'tenantDomain','type':'STRING'}," +
                "          {'name':'hostName','type':'STRING'}," +
                "          {'name':'apiPublisherApi','type':'STRING'}," +
                "          {'name':'applicationName','type':'STRING'}," +
                "          {'name':'applicationId','type':'STRING'}," +
                "          {'name':'userAgent','type':'STRING'}," +
                "          {'name':'tier','type':'STRING'}," +
                "          {'name':'throttledOut','type':'BOOL'}," +
                "          {'name':'clientIp','type':'STRING'}" +
                "  ]" +
                "}";
    }

    public static String getStreamDefinitionExecutionTime() {
        return "{\n" +
                "  \"name\": \"org.wso2.apimgt.statistics.execution.time\",\n" +
                "  \"version\": \"1.0.0\",\n" +
                "  \"nickName\": \"Execution Time Data\",\n" +
                "  \"description\": \"This stream will persist the data which send by the mediation executions\",\n" +
                "  \"metaData\": [\n" +
                "    {\n" +
                "      \"name\": \"clientType\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"payloadData\": [\n" +
                "    {\n" +
                "      \"name\": \"api\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"api_version\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"tenantDomain\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"apiPublisherApi\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"apiResponseTime\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"context\",\n" +
                "      \"type\": \"STRING\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"securityLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"throttlingLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"requestMediationLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"responseMediationLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"backendLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"otherLatency\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"eventTime\",\n" +
                "      \"type\": \"LONG\"\n" +
                "    }\n" +

                "  ]\n" +
                "}";
    }

    public static String getStreamDefinitionWorkflow() {
        return "{" +
                "  'name': 'org.wso2.apimgt.statistics.workflow'," +
                "  'version': '1.0.0'," +
                "  'nickName': 'API Manager Workflow Data'," +
                "  'description': 'Workflow Data'," +
                "  'metaData': [" +
                "    {" +
                "      'name': 'clientType'," +
                "      'type': 'STRING'" +
                "    }" +
                "  ]," +
                "  'payloadData': [" +
                "    {" +
                "      'name': 'workflowReference'," +
                "      'type': 'STRING'" +
                "    }," +
                "    {" +
                "      'name': 'workflowStatus'," +
                "      'type': 'STRING'" +
                "    }," +
                "    {" +
                "      'name': 'tenantDomain'," +
                "      'type': 'STRING'" + "    }," +
                "    {" +
                "      'name': 'workflowType'," +
                "      'type': 'STRING'" + "    }," +
                "    {" +
                "      'name': 'createdTime'," +
                "      'type': 'LONG'" + "    }," +
                "    {" +
                "      'name': 'updatedTime'," +
                "      'type': 'LONG'" + "    }" +
                "  ]" +
                "}";
    }

    public static String getStreamDefinitionDestination() {
        return "{" +
                "  'name': 'org_wso2_apimgt_statistics_destination'," +
                "  'version': '1.0.0'," +
                "  'nickName': 'destination_statistics'," +
                "  'description': 'Stream for API Manager destination based statistics'," +
                "  'metaData': [" +
                "    {'name': 'tenant_id','type': 'INT'}," +
                "    {'name': 'http_method','type':'STRING'}," +
                "    {'name': 'character_set_encoding','type': 'STRING'}," +
                "    {'name': 'remote_address','type': 'STRING'}," +
                "    {'name': 'transport_in_url','type': 'STRING'}," +
                "    {'name': 'message_type','type': 'STRING'}," +
                "    {'name': 'remote_host','type': 'STRING'}," +
                "    {'name': 'service_prefix','type': 'STRING'}," +
                "    {'name': 'host','type': 'STRING'}" +
                "  ]," +
                "  'correlationData': [" +
                "    {'name': 'activity_id','type': 'STRING'}" +
                "  ]," +
                "  'payloadData': [" +
                "    {'name': 'message_direction','type': 'STRING'}," +
                "    {'name': 'operation_name','type': 'STRING'}," +
                "    {'name': 'message_id','type': 'STRING'}," +
                "    {'name': 'timestamp','type': 'LONG'}," +
                "    {'name': 'api','type': 'STRING'}," +
                "    {'name': 'version','type': 'STRING'}," +
                "    {'name': 'request','type': 'INT'}," +
                "    {'name': 'apiPublisherApi','type': 'STRING'}," +
                "    {'name': 'context','type': 'STRING'}," +
                "    {'name': 'destination','type': 'STRING'}," +
                "    {'name': 'requestTime','type': 'LONG'}," +
                "    {'name': 'hostName','type': 'STRING'}" +
                "  ]" +
                "}";
    }

    public static String getStreamDefinitionFault() {
        return "{" + "  'name': 'org.wso2.apimgt.statistics.fault',"
                + "  'version': '1.0.0',"
                + "  'nickName': 'API Manager Fault Data',"
                + "  'description': 'Fault Data',"
                + "  'metaData': ["
                + "    {'name': 'clientType','type': 'STRING' }"
                + "  ],"
                + "  'payloadData': ["
                + "    {'name': 'consumerKey','type': 'STRING' },"
                + "    {'name': 'context','type': 'STRING' },"
                + "    {'name': 'api_version','type': 'STRING'},"
                + "    {  'name': 'api','type': 'STRING'},"
                + "    {  'name': 'resourcePath','type': 'STRING'},"
                + "    {  'name': 'method','type': 'STRING'},"
                + "    {  'name': 'version','type': 'STRING'},"
                + "    {  'name': 'errorCode','type': 'STRING'},"
                + "    {  'name': 'errorMessage','type': 'STRING'},"
                + "    {  'name': 'requestTime','type': 'LONG'},"
                + "    {  'name': 'userId','type': 'STRING'},"
                + "    {  'name': 'tenantDomain','type': 'STRING'},"
                + "    {  'name': 'hostName','type': 'STRING'},"
                + "    {  'name': 'apiPublisherApi','type': 'STRING'},"
                + "    {  'name': 'applicationName','type': 'STRING'},"
                + "    {  'name': 'applicationId','type': 'STRING'},"
                + "    {  'name': 'protocol','type': 'STRING'}"
                + "  ]"
                + "}";
    }

    public static String getStreamDefinitionThrottle() {
        return "{" + "  'name': 'org.wso2.apimgt.statistics.throttle',"
                + "  'version': '1.0.0',"
                + "  'nickName': 'API Manager Throttle Data',"
                + "  'description': 'Throttle Data',"
                + "  'metaData': [{"
                + "      'name': 'clientType','type': 'STRING'" + "    }"
                + "  ],"
                + "  'payloadData': ["
                + "    {'name': 'accessToken','type': 'STRING'},"
                + "    {'name': 'userId','type': 'STRING'},"
                + "    {'name': 'tenantDomain','type': 'STRING'},"
                + "    {'name': 'api','type': 'STRING'},"
                + "    {'name': 'api_version','type': 'STRING'},"
                + "    {'name': 'context','type': 'STRING'},"
                + "    {'name': 'apiPublisherApi','type': 'STRING'},"
                + "    {'name': 'throttledTime','type': 'LONG'},"
                + "    {'name': 'applicationName','type': 'STRING'},"
                + "    {'name': 'applicationId','type': 'STRING'},"
                + "    {'name': 'subscriber','type': 'STRING'},"
                + "    {'name': 'throttledOutReason','type': 'STRING'}"
                + "  ]"
                + "}";
    }
}
