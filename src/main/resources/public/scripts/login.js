var loginApp = angular.module("login",[]);
loginApp.controller("loginController",function($scope,$http){
    
   $scope.login = function(){
   var data = "username=user@gmail.com&password=password&submit=Login";
         
        $http({
            method: 'POST',
            url: '/j_spring_security_check',
            data: data,
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
              }
        })  
        .success(function(data, status){
            
        })
        .error(function(data, status){
           alert("error"); 
         });
    
    }
    
});