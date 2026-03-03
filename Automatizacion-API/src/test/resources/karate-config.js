function fn() {

  var config = {
    baseUrl: 'https://petstore.swagger.io/v2'
  };

  config.endpoints = karate.callSingle('classpath:config/endpoints.js');

  return config;
}