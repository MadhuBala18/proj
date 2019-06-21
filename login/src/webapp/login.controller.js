angular.module('myapp').controller('logincontroller',['$scope','loginService',loginController]);
// loginController.$inject=['$scope','loginService'];
function loginController($scope,loginService){
    $scope.value="madhu";
    var loginsuccess=function(){
        alert("SUCCESSFUL LOGIN");
    }
    var loginfailure=function(){
        alert("FAILURE IN LOGIN");
    }
    var func1=function()
    {
        if($scope.pass!="")
        {
        //    alert("D");
            loginService.getAllUser()
            .then(function(response){
                loginsuccess();
                $scope.userdetails=response;
            },function(error)
            {
                loginfailure();
            });
        }
    }
$scope.func=function()
{
    func1();
}
//    func1();
}