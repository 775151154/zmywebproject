/**
 * 禁用右键功能
 */
document.oncontextmenu=function(){return false;};

/**
 * 禁用树节点右键功能
 * 
 * @param treeId
 */
function stopTreeRefresh(treeId) {
    var dataItemTree = document.getElementById(treeId);
    dataItemTree.oncontextmenu = function() {return false;};
}

/**
 * 提示信息弹出框
 * 
 * @param type
 * @param message
 */
function tipMsg(type,message) {
	var options = {
			state:type,
			content:message
		};
	parent.showTips(options,false);
}

/**
 * 提示信息弹出框（子页面调用）
 * 
 * @param type
 * @param message
 */
function parentTipMsg(type,message) {
	var options = {
			state:type,
			content:message
		};
	parent.parent.showTips(options,false);
}

/**
 * 确认弹出框
 * 
 * @param title
 * @param msg
 * @param callback
 */
function showConfirm(title, msg, callback){
	parent.showConfirm(title, msg, callback);
}

/**
 * 错误信息
 * 
 * @param title
 * @param content
 * @param msgDetail
 */
function showError(options){
	parent.showError(options);
}

/**
 * 关闭遮罩
 */
function hideMask(){
	parent.hideMask();
}

/**
 * 异步ajax
 */
$.postJSON = function(url, data, callback) {
	return jQuery.ajax( {
		type : 'POST',
		url : url,
		contentType : 'application/json;charset=UTF-8',
		data : JSON.stringify(data),
		dataType : 'json',
		success : function(data, textStatus){
			// if(typeof(data[0])=="undefined"){
			// top.window.location='https://www.baidu.com/'
			// }else{
			callback(data);
			// }
		},
		async : true,
		'error':function(XMLHttpRequest, textStatus, errorThrown){
			var error = XMLHttpRequest.responseText;
			parent.hideMask();
			if(error.length>0){
				parent.showError({
					title:'itcs错误信息',
					content:'itcs程序出错',
					msgDetail:error
				});
			}
		}
	});
};



/**
 * 同步ajax
 */
$.postJSONSync = function(url, data, callback) {
	return jQuery.ajax( {
		type : 'POST',
		url : url,
		contentType : 'application/json;charset=UTF-8',
		data : JSON.stringify(data),
		dataType : 'json',
		success : function(data, textStatus){
			
			// if(typeof(data[0])=="undefined"){
			// top.window.location='https://www.baidu.com/'
			// }else{
			callback(data);
			// }
		},
		async:false,
		'error':function(XMLHttpRequest, textStatus, errorThrown){
			var error = XMLHttpRequest.responseText;
			parent.hideMask();
			if(error.length>0){
				parent.showError({
					title:'itcs错误信息',
					content:'itcs程序出错',
					msgDetail:error
				});
			}
		}
	});
};

/**
 * 判断非空，如果非空返回true
 * 
 * @param str
 * @returns {Boolean}
 */
function isNotNull(str){
	if(str==null || str=='' || str=='undefiend' || typeof(str) == null || typeof(str) == "undefined" ){
		return false;
	}
	return true;
}

/**
 * 判断为空，如果为空返回true
 * 
 * @param str
 * @returns {Boolean}
 */
function isNull(str){
	if(str==null || str=='' || str=='undefiend' || typeof(str) == null || typeof(str) == "undefined" ){
		return true;
	}
	return false;
}

/**
 * 如果不是正整数则返回true
 * 
 * @param num
 * @returns {Boolean}
 */
function isNotInt(num){
	if(isNaN(num)||num!=parseInt(num)||parseInt(num)<0){
		return true;
	}
	return false;
}

/**
 * 初始化搜索框
 * 
 * @param id
 * @param initValue
 */
function initSearchInput(id,initValue){
	$("#"+id).focus(function(){
		if(this.value==initValue){
			this.value="";
			$("#"+id).css("color","#333");
		}
	});
	$("#"+id).blur(function(){
		 if(this.value==""){
		 	this.value=initValue;
		 	$("#"+id).css("color","#9a9a9a");
		 }
	});
}

/**
 * 给名称过长的列加title
 * 
 * @param value
 * @param row
 * @param index
 * @returns {String}
 */
function seeLongName(value,row,index){
	var str = '<p title="'+value+'">'+value+'</p>';
	return str;
}

/**
 * 日期限制范围的写法
 * 
 * @param date
 */
function selectBegTime(date) {
	$("#endTime").datebox("calendar").calendar({
		validator: function(date){
			var nowTime = new Date(nowDate.split("-")[0], nowDate.split("-")[1]-1, nowDate.split("-")[2]);
			var begTime = $("#begTime").datetimebox("getValue");
			var tempBegTime = begTime.split(" ")[0];
			var compareBegTime = new Date(tempBegTime.split("-")[0], tempBegTime.split("-")[1]-1, tempBegTime.split("-")[2]);
			return  date >= compareBegTime && date <= nowTime;
		}
	});
}

/**
 * 选择结束时间
 * 
 * @param date
 */
function selectEndTime(date) {
	$("#begTime").datebox("calendar").calendar({
		validator: function(date){
			var nowTime = new Date(nowDate.split("-")[0], nowDate.split("-")[1]-1, nowDate.split("-")[2]);
			var endTime = $("#endTime").datetimebox("getValue");
			var tempEndTime = endTime.split(" ")[0];
			var compareEndTime = new Date(tempEndTime.split("-")[0], tempEndTime.split("-")[1]-1, tempEndTime.split("-")[2]);
			return date <= compareEndTime && date <= nowTime;	
		}
	});
}
/**
 * 初始化起始时间
 * @param endTime
 */
function initBegTime(endTime) {
	$("#begTime").datebox("calendar").calendar({
		validator: function(date){
			var nowTime = new Date(nowDate.split("-")[0], nowDate.split("-")[1]-1, nowDate.split("-")[2]);
			var tempEndTime = endTime.split(" ")[0];
			var compareEndTime = new Date(tempEndTime.split("-")[0], tempEndTime.split("-")[1]-1, tempEndTime.split("-")[2]);
			return date <= compareEndTime  && date <= nowTime;
		}
	});
}
/**
 * 初始结束始时间
 * @param begTime
 */
function initEndTime(begTime) {
	$("#endTime").datebox("calendar").calendar({
		validator: function(date){
			var nowTime = new Date(nowDate.split("-")[0], nowDate.split("-")[1]-1, nowDate.split("-")[2]);
			var tempBegTime = begTime.split(" ")[0];
			var compareBegTime = new Date(tempBegTime.split("-")[0], tempBegTime.split("-")[1]-1, tempBegTime.split("-")[2]);
			return  date >= compareBegTime && date <= nowTime;
		}
	});
}

/**
 * 获取当前勾选的行
 * 
 * @param currRows
 * @param ckrow
 * @returns
 */
function getDatagridSelectRows(currRows,ckrow){
	if(ckrow["all"] == 1){
		for(var i=0;i<currRows.length;i++){
			datagrid.datagrid("endEdit", i);
		}
		return currRows;
	}else{
		var rows = new Array();
		for(var i=0;i<currRows.length;i++){
			if(editRows[i]==1){
				datagrid.datagrid("endEdit", i);
			}
			if(ckrow[i]==1){
				rows.push(currRows[i]);
			}
		}	
		return rows;
	}
}

/**
 * eos excel工具方法
 */
var eosExcelUtils = {

	/**
	 * 导出dataGrid当前页面数据，供前端调用
	 * 
	 * @param dataGridId
	 */
	exportExcel : function(dataGridId) {
		var $dataGrid = $("#" + dataGridId);
		// 获取数据行
		var tableData = [];
		for ( var int = 0; int < $("table.datagrid-btable").children().children().length; int++) {
	    	var tr=$("table.datagrid-btable").children().children('TR').eq(int);
	    	var trData={};
	    	for ( var int2 = 0; int2 < tr.children().length; int2++) {
	    		var tdId=tr.children().eq(int2).attr("field");
				var tdval=tr.children().children("div").eq(int2).text();
				trData[tdId]=tdval;
			}
			tableData[int]=trData;
		}
		var dataRows = $dataGrid.datagrid("getRows");
		// 没有数据不导出
		if (!eosExcelUtils.checkDataGridDataRows(dataRows)) {
			return;
		} else {
			dataRows = tableData;
		}
		var form = document.createElement("form");
		document.body.appendChild(form);
		form.action = "/eepa/com.tl.eas.sp.component.exportexcel.exportExcelFromGrid.flow";
		form.method = "post";
		// 获取列字段列表
		var colFields = $dataGrid.datagrid("getColumnFields");
		for (var i = 0, len = colFields.length; i < len; i++) {
			var colOption = $dataGrid.datagrid("getColumnOption", colFields[i]);
			// 是否隐藏
			if (colOption.hidden || "ck" == colOption.field || "AUTOTASK_ID" == colOption.field) {
				continue;
			}
			var newHeader = document.createElement("input");
			newHeader.setAttribute("name", "extendInfo[" + i + "]/header");
			newHeader.setAttribute("type", "hidden");
			newHeader.setAttribute("value", colOption.title);
	
			var newField = document.createElement("input");
			newField.setAttribute("name", "extendInfo[" + i + "]/field");
			newField.setAttribute("type", "hidden");
			newField.setAttribute("value", colOption.field);
	
			var newWidth = document.createElement("input");
			newWidth.setAttribute("name", "extendInfo[" + i + "]/width");
			newWidth.setAttribute("type", "hidden");
			newWidth.setAttribute("value", colOption.width + "px");
	
			form.appendChild(newHeader);
			form.appendChild(newField);
			form.appendChild(newWidth);
		}
		// 获取数据行
		for (var j = 0, leng = dataRows.length; j < leng; j++) {
			var dataRow = dataRows[j];
			for ( var key in dataRow) {
				var sheets = document.createElement("input");
				sheets.setAttribute("name", "sheets[" + j + "]/" + key);
				sheets.setAttribute("type", "hidden");
				sheets.setAttribute("value", dataRow[key]);
				form.appendChild(sheets);
			}
		}
		form.submit();
	},
	
	/**
	 * 导出所有 通过查询数据库获取数据后导出，供前端调用
	 * 
	 * @param datagridId
	 *            数据表格id
	 * @param condParam
	 *            查询条件参数
	 * @param logicName
	 *            逻辑流名称
	 * @param callback
	 *            回调函数
	 */
	exportExcelAll : function(dataGridId, condParam, logicName, callback) {
		var $dataGrid = $("#" + dataGridId);
		// 获取数据行
		var dataRows = $dataGrid.datagrid("getRows");
		// 没有数据不导出
		if (!eosExcelUtils.checkDataGridDataRows(dataRows)) {
			return;
		}
		// 用于提交数据的表单
		var form = document.createElement("form");
		document.body.appendChild(form);
		form.action = "/eepa/com.tl.eas.eepa.biz.export.exportAll.flow";
		form.method = "post";
	
		var redisKeyInput = document.createElement("input");
		redisKeyInput.setAttribute("name", "exportRedisKey");
		redisKeyInput.setAttribute("type", "hidden");
		// 获取导出rediskey值，十位随机数字
		var exportRedisKey = eosExcelUtils.getExportRedisKey();
		redisKeyInput.setAttribute("value", exportRedisKey);
		form.appendChild(redisKeyInput);
	
		// 逻辑流名称输入框
		var logicNameInput = document.createElement("input");
		logicNameInput.setAttribute("name", "logicName");
		logicNameInput.setAttribute("type", "hidden");
		logicNameInput.setAttribute("value", logicName);
	
		form.appendChild(logicNameInput);
	
		// 获取列字段列表
		var colFields = $dataGrid.datagrid("getColumnFields");
		for (var i = 0, len = colFields.length; i < len; i++) {
			var colOption = $dataGrid.datagrid("getColumnOption", colFields[i]);
			// 是否隐藏
			if (colOption.hidden || "ck" == colOption.field || "AUTOTASK_ID" == colOption.field) {
				continue;
			}
			var newHeader = document.createElement("input");
			newHeader.setAttribute("name", "extendInfo[" + i + "]/header");
			newHeader.setAttribute("type", "hidden");
			newHeader.setAttribute("value", colOption.title);
	
			var newField = document.createElement("input");
			newField.setAttribute("name", "extendInfo[" + i + "]/field");
			newField.setAttribute("type", "hidden");
			newField.setAttribute("value", colOption.field);
	
			var newWidth = document.createElement("input");
			newWidth.setAttribute("name", "extendInfo[" + i + "]/width");
			newWidth.setAttribute("type", "hidden");
			newWidth.setAttribute("value", colOption.width + "px");
	
			form.appendChild(newHeader);
			form.appendChild(newField);
			form.appendChild(newWidth);
		}
		for ( var key in condParam) {
			// 查询条件
			var condParamInput = document.createElement("input");
			condParamInput.setAttribute("name", "condParam/" + key);
			condParamInput.setAttribute("type", "hidden");
			condParamInput.setAttribute("value", condParam[key]);
			form.appendChild(condParamInput);
		}
		form.submit();
		if (callback && typeof callback == "function") {
			// 轮询exportRedisKey值是否变化
			eosExcelUtils.cycleReq(exportRedisKey, callback);
		}
	},
	
	/**
	 * 校验dataGrid数据行，如果没有数据则提示，不导出
	 * 
	 * @param dataRows
	 *            数据行
	 * 
	 * @return boolean
	 */
	checkDataGridDataRows : function(dataRows) {
		if (!dataRows || dataRows.length == 0) {
			tipMsg('warning', '没有可导出数据！');
			return false;
		}
		return true;
	},
	
	/**
	 * 导出按钮点击后轮询操作
	 * 
	 * @param exportRedisKey
	 * @param callback
	 */
	cycleReq : function(exportRedisKey, callback) {
		var json = {
			param : {
				"exportRedisKey" : exportRedisKey
			}
		};
		var excelInterval = setInterval(
				function() {
					jQuery.ajax({
								url : "/eepa/com.tl.eas.eepa.biz.excelHelper.excelHelper.cycleRedis.biz.ext",
								type : "post",
								data : JSON.stringify(json),
								cache : false,
								contentType : 'text/json',
								success : function(e) {
									if (e.result != null) {
										clearInterval(excelInterval);
										// 回调函数
										callback();
									}
								}
							});
				}, 1000);
	},

	/**
	 * 获取redisKey值，十位随机数字
	 */
	getExportRedisKey : function() {
		var random = (new Date().getTime()) + '';
		return random.substr(3);
	}

};
