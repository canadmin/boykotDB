$(document).ready(function() {
    selectPage();

});

function selectPage() {
    $('#login').click(function (e) {
        $('.register').addClass("hidden");
        $('.login').removeClass("hidden");

        $('.kayit').removeClass("page-active");
        $('.giris').addClass("page-active")
    });
    $('#register').click(function (e) {
        $('.login').addClass("hidden");
        $('.register').removeClass("hidden");

        $('.kayit').addClass("page-active");
        $('.giris').removeClass("page-active")
    });

}