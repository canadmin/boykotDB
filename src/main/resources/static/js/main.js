$(document).ready(function() {
    $('#login').click(function (e) {
        $('.register').addClass("hidden");
        $('.login').removeClass("hidden");
    });
    $('#register').click(function (e) {
        $('.login').addClass("hidden");
        $('.register').removeClass("hidden");
    });

});