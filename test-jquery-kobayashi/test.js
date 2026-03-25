'use strict'

// 問題１
$(function(){
    console.log("小林啓祐");
});

// 問題２
$(function(){
    $("#changeColor").on("click", function(){
        let $myName = $("#myName");
        $myName.css("color", "red");    
    });
});

// 問題３
$(function(){

    $("#ageAlert").on("click", function(){
        let $myAge = $("#ageInput");
        
        // どうやって値を出せばいいんだっけ・・・
        alert($myAge);
    });

});

// 問題４
$(function(){

    $("#singleClick").on("click", function(){

        // 忘れた
        $("#singleClick")

    });

});