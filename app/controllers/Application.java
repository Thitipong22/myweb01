package controllers;

import com.sun.org.apache.regexp.internal.RE;
import models.Products;
import play.api.templates.Html;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Products shirt1 = new Products("เสื้อโปโลชาย","S,M,L,XL","เหลือง",500.00,50);
    public static Products shirt2 = new Products("เสื้อโปโลชาย","S,M,L,XL","ดำ",500.00,50);
    public static Products shirt3 = new Products("เสื้อโปโลชาย","S,M,L,XL","ขาว",500.00,50);
    public static Products pant1 = new Products("กางเกงกีฬาชาย","S,M,L,XL","ดำ",150.00,50);
    public static Products pant2 = new Products("กางเกงกีฬาชาย","S,M,L,XL","น้ำเงิน",150.00,50);
    public static Products pant3 = new Products("กางเกงกีฬาชาย","S,M,L,XL","เขียว",150.00,50);


    public static Result main(Html content){return ok(main.render(content));}
    public static Result index() {return main(home.render());}
    public static Result shirt() {return main(shirt.render());}
    public static Result pant() {return main(pant.render());}
    public static Result location() {return main(location.render());}
    public static Result promotion() {return main(promotion.render());}

    public static Result shopro() {return main(shopro.render(shirt1,shirt2,shirt3,pant1,pant2,pant3));}



}
