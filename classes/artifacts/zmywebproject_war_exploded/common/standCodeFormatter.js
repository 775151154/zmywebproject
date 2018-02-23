/**
 * 参数状态（表格）
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getParaStatus(value,rowData,rowIndex){
	var code=temptypeCode.paraStatus;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 参数状态（输入框）
 * @param value
 * @returns {String}
 */
function getParaStatueName(value){
	var code=temptypeCode.paraStatus;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 测量点类型
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getMpedType(value,rowData,rowIndex){
	var code=temptypeCode.mpedType;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 通讯速率
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getMeterBaudRate(value,rowData,rowIndex){
	var code=temptypeCode.meterBaudRate;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 电表通讯规约
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getProtocolName(value,rowData,rowIndex){
	var code=temptypeCode.meterProtocolType;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 电表型号
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getAmmeterModel(value,rowData,rowIndex){
	var code=temptypeCode.ammeterModel;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 用户大类号
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getUserFlag(value,rowData,rowIndex){
	var code=temptypeCode.userFlag;
	var typeName="";
	if(isNotNull(code)){
		$.each(code,function(i,tempdata){
			if(value==tempdata.codeTitle){
				typeName=tempdata.codeName;	
			}		
		});
	}
	return typeName;
}

/**
 * 用户小类号
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getSmallFlag(value,rowData,rowIndex){
	if(isNull(value)){
		return;
	}
	var code = "";
	var typeName="";
	var userFlagValue = rowData.userFlag;
	if(userFlagValue=="01"){
		code=temptypeCode.AsmallType;
	}else if(userFlagValue=="02"){
		code=temptypeCode.BsmallType;
	}else if(userFlagValue=="03"){
		code=temptypeCode.CsmallType;
	}else if(userFlagValue=="04"){
		code=temptypeCode.DsmallType;
	}else if(userFlagValue=="05"){
		code=temptypeCode.EsmallType;
	}else if(userFlagValue=="06"){
		code=temptypeCode.FsmallType;
	}else if(userFlagValue=="07"){
		code=temptypeCode.GsmallType;
	}else if(userFlagValue=="08"){
		code=temptypeCode.HsmallType;
	}else if(userFlagValue=="09"){
		code=temptypeCode.IsmallType;
	}else if(userFlagValue=="10"){
		code=temptypeCode.JsmallType;
	}else if(userFlagValue=="11"){
		code=temptypeCode.KsmallType;
	}else if(userFlagValue=="12"){
		code=temptypeCode.LsmallType;
	}else if(userFlagValue=="13"){
		code=temptypeCode.MsmallType;
	}else if(userFlagValue=="14"){
		code=temptypeCode.NsmallType;
	}
	if(isNotNull(code)){
		$.each(code,function(i,tempdata){
			if(value==tempdata.codeTitle){
				typeName=tempdata.codeName;	
			}		
		});
	}
	return typeName;
}

/**
 * 脉冲属性
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getPulsePro(value,rowData,rowIndex){
	var code=temptypeCode.pulseAttribute;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 电压/电流模拟量属性
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getAnalogProperty(value,rowData,rowIndex){
	var code=temptypeCode.analogAttribute;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 单相表接线相
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getMeterConnectPhase(value,rowData,rowIndex){
	var code=temptypeCode.meterConnectPhase;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 电源接线方式
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getConnectWay(value,rowData,rowIndex){
	var code=temptypeCode.connectWay;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 数据分级类号
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getDataClassify(value,rowData,rowIndex){
	var code=temptypeCode.dataClassify;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 周期单位
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getCycleUnit(value,rowData,rowIndex){
	var code=temptypeCode.CycleUnit;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 是否标志
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getYesOrNo(value,rowData,rowIndex){
	var code=temptypeCode.yesOrNo;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 直流模拟量冻结密度
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getFreezeDensity(value,rowData,rowIndex){
	var code=temptypeCode.freezeDensity;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 总加组状态
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getValidStatus(value,rowData,rowIndex){
	var code=temptypeCode.validStatus;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 直流模拟量端口接入状态
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getDcAnalogStatus(value,rowData,rowIndex){
	var code=temptypeCode.dcanalogStatus;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 方向标志
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getDirection(value,rowData,rowIndex){
	var code=temptypeCode.measureId;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 加减标志
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getComputeFlag(value,rowData,rowIndex){
	var code=temptypeCode.calculateId;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 限电时间
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getBrownoutsTime(value,rowData,rowIndex){
	var code=temptypeCode.brownoutsTime;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 告警延时时间
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getAlarmDelay(value,rowData,rowIndex){
	var code=temptypeCode.alarmDelay;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}

/**
 * 轮次开关当前状态
 * @param value
 * @param rowData
 * @param rowIndex
 * @returns {String}
 */
function getSwitchCtrType(value,rowData,rowIndex){
	var code=temptypeCode.switchCtrType;
	var typeName="";
	$.each(code,function(i,tempdata){
		if(value==tempdata.codeTitle){
			typeName=tempdata.codeName;	
		}		
	});
	return typeName;
}
