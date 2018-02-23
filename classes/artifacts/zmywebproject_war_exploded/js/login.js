//主处理
$(function(){
	//给登录按钮绑定单击处理
	$("#login").click(userLogin);
	//给注册按钮绑定单击处理
//	$("#regist_button").click(userRegist);
});

function userLogin(){
	//获取请求参数
	var name = $("#count").val().trim();
	console.log(name);
//	var password = $("#password").val().trim();
//	//检测格式
//	var ok = true;//是否通过校验
//	if(name==""){
//		$("#count_span").html("用户名为空");
//		ok = false;
//	}
//	if(password==""){
//		$("#password_span").html("密码为空");
//		ok = false;
//	}
	//发送Ajax请求
//	if(ok){//(通过格式检测)
		$.ajax({
			url:"http://localhost:8080/talk_pro"+"/talk/begin.do",
			type:"post",
			data:{"name":name},
			dataType:"text",
			success:function(name){
				
				window.location.href="talking.html";
					alert("登录成功");
				//result是服务器返回的JSON结果
				//{"status":xx,"msg":xx,"data":xx}
//				if(result.status==0){//成功
//					//将用户信息写入Cookie
//					var userId = result.data.cn_user_id;
//					addCookie("userId",userId,2);
//					window.location.href="edit.html";
//				}else if(result.status==1){//用户名错
//					$("#count_span").html(result.msg);
//				}else if(result.status==2){//密码错
//					$("#password_span").html(result.msg);
//				}
			},
			error:function(){
				alert("登录失败");
			}
		});
//	}
};
