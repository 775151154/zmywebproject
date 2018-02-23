/**
 * 用于加载省市县供电所用电单位下拉框
 * orgNo 为当前单位编号，type是单位级别，1：省公司，2：市公司，3：县公司
 * @param orgNo
 * @param type
 * @param isSpecial
 */
function loadorgNo(orgNo,type,isSpecial){
		var param = {
			"belongOrgNo" :orgNo
		};
		$.postJSON( '/itcs/Common/getOrgNo', param, function(e) {
			if (e) {
				var provinceOrg=new Array();
				var cityOrg=new Array();
				var countyOrg=new Array();
				var townsOrg=new Array();
				for(var i=0;i<e.orgNo1.length;i++){
					if(i==0){
						provinceOrg.push({label:e.orgNo1[i].ORG_NO,value:e.orgNo1[i].ORG_NAME,selected:true});
					}else{
						provinceOrg.push({label:e.orgNo1[i].ORG_NO,value:e.orgNo1[i].ORG_NAME});
					}
				}
				if(e.orgNo2.length==1){
					cityOrg.push({label: e.orgNo2[0].ORG_NO,value: e.orgNo2[0].ORG_NAME,selected:true});
				}else{
					var j = 1;
					if(isNotNull(isSpecial)){
						if(isSpecial){
							j = 0;
						}
					}
					for(var i=j;i<e.orgNo2.length;i++){
						if(i==j){
							cityOrg.push({label: e.orgNo2[i].ORG_NO,value: e.orgNo2[i].ORG_NAME,selected:true});
						}else{
							cityOrg.push({label: e.orgNo2[i].ORG_NO,value: e.orgNo2[i].ORG_NAME});
						}
					}
				}
				for(var i=0;i<e.orgNo3.length;i++){
					if(i==0){
						countyOrg.push({label: e.orgNo3[i].ORG_NO,value: e.orgNo3[i].ORG_NAME,selected:true});
					}else{
						countyOrg.push({label: e.orgNo3[i].ORG_NO,value: e.orgNo3[i].ORG_NAME});
					}
				}
				for(var i=0;i<e.orgNo4.length;i++){
					if(i==0){
						townsOrg.push({label: e.orgNo4[i].ORG_NO,value: e.orgNo4[i].ORG_NAME,selected:true});
					}else{
						townsOrg.push({label: e.orgNo4[i].ORG_NO,value: e.orgNo4[i].ORG_NAME});
					}
				}
				if("41101"==orgNo&&isNull(type)&&isNull(isSpecial)){
					loadorgNo("41401","2",false);
				}
			}
			if(isNull(orgNo)){
				if(type==1){
					$("#provinceOrg").empty();
					$("#cityOrg").empty();
					$("#countyOrg").empty();
					$("#townsOrg").empty();
				}else if(type==2){
					//全部的时候自动高度，不固定高度，不然会下方空白
					$("#countyOrg").combobox({'panelHeight': 'auto'});
					$("#townsOrg").combobox({'panelHeight': 'auto'});
					$("#countyOrg").combobox('loadData', [{label: '',value: '全部'}]);
					$("#townsOrg").combobox('loadData', [{label: '',value: '全部'}]);
					$("#countyOrg").combobox('setValue', '');
					$("#townsOrg").combobox('setValue', '');
				}else if(type==3){
					//全部的时候自动高度，不固定高度，不然会下方空白
					$("#townsOrg").combobox({'panelHeight': 'auto'});
					$("#townsOrg").combobox('loadData', [{label: '',value: '全部'}]);
					$("#townsOrg").combobox('setValue', '');
				}else{
					$("#cityOrg").empty();
					$("#countyOrg").empty();
					$("#townsOrg").empty();
				}
			}else{
				if(type==1){
					$("#provinceOrg").empty();
					$("#cityOrg").empty();
					$("#countyOrg").empty();
					$("#townsOrg").empty();
					$('#provinceOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: provinceOrg
					});
					$('#cityOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: cityOrg
					});
					$('#countyOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: countyOrg
					});
					$('#townsOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: townsOrg
					});
				}else if(type==2){
					$("#countyOrg").empty();
					$("#townsOrg").empty();
					$('#countyOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: countyOrg
					});
					$('#townsOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: townsOrg
					});
				}else if(type==3){
					$("#townsOrg").empty();
					$('#townsOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: townsOrg
					});
				}else{
					$("#provinceOrg").empty();
					$("#cityOrg").empty();
					$("#countyOrg").empty();
					$("#townsOrg").empty();
					$('#provinceOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: provinceOrg
					});
					$('#cityOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: cityOrg
					});
					$('#countyOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: countyOrg
					});
					$('#townsOrg').combobox({
						valueField: 'label',
						textField: 'value',
						data: townsOrg
					});
				}
			}
		});
	}