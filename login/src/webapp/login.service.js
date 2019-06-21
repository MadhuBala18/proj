angular.module('myapp',[]).factory('loginService',loginService);
loginService.$inject=['$http'];
function loginService($http){
        // alert("sad");
        var GET_ALL_DETAILS='/api/alldetails';
        var getAllUser=function()
        {
            // alert("SFs");
            return $http.get(GET_ALL_DETAILS);
        }
        return {
            getAllUser:getAllUser
        }
}