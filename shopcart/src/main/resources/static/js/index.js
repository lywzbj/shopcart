

function loadPhone() {
    
    $.ajax({
        url:'/phone/all',
        method:'get',
        success:function (result) {
            if(result==null){
                alert("未获取到数据");
            }else{
                $("#allPhone").empty();
                for(var i=0;i<result.length;i++){
                    var id=result[i].phoneid;
                    var outSide=$("<div></div>").attr("class","mingxing fl");
                    var subDiv=$("<div></div>").attr("class","sub_mingxing");
                    var aLabel=$("<a></a>").attr("href","xiangqing.html?id="+id);
                    var image=$("<img>").attr("src",result[i].url);
                    var name=$("<div></div>").text(result[i].phonename);
                        name.attr("class","pinpai");
                    var desc=$("<div></div>").text(result[i].phonedes);
                        desc.attr("class","youhui");
                    var price=$("<div></div>").text(result[i].price+"元");
                        price.attr("class","jiage");
                    aLabel.append(image);
                    subDiv.append(aLabel);
                    outSide.append(subDiv);
                    outSide.append(name);
                    outSide.append(desc);
                    outSide.append(price);

                    $("#allPhone").append(outSide);
                }



            }



        }
        
    });
}



loadPhone();



