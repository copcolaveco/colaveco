gx.evt.autoSkip=!1;gx.define("wwpublicidad",!1,function(){var n,t;this.ServerClass="wwpublicidad";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.wwpublicidad";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e110z2_client=function(){return this.executeServerEvent("'DOINSERT'",!1,null,!1,!1)};this.e150z2_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e160z2_client=function(){return this.executeServerEvent("CANCEL",!0,arguments[0],!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,26,27,28,29,30,31,32,33,34,35,36];this.GXLastCtrlId=36;this.GridContainer=new gx.grid.grid(this,2,"WbpLvl2",25,"Grid","Grid","GridContainer",this.CmpContext,this.IsMasterPage,"wwpublicidad",[],!1,1,!1,!0,0,!0,!1,!1,"",0,"px",0,"px","New row",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.GridContainer;t.addSingleLineEdit(183,26,"PUBLICIDADID","Id","","PublicidadId","int",0,"px",18,18,"right",null,[],183,"PublicidadId",!0,0,!1,!1,"Attribute",1,"WWColumn WWOptionalColumn");t.addSingleLineEdit(184,27,"PUBLICIDADTITULO","Titulo","","PublicidadTitulo","char",0,"px",256,80,"left",null,[],184,"PublicidadTitulo",!0,0,!1,!1,"DescriptionAttribute",1,"WWColumn");t.addSingleLineEdit(185,28,"PUBLICIDADSUBTITULO","Sub Titulo","","PublicidadSubTitulo","char",0,"px",256,80,"left",null,[],185,"PublicidadSubTitulo",!0,0,!1,!1,"Attribute",1,"WWColumn WWOptionalColumn");t.addSingleLineEdit(186,29,"PUBLICIDADDESCRIPCION","Descripcion","","PublicidadDescripcion","char",0,"px",256,80,"left",null,[],186,"PublicidadDescripcion",!0,0,!1,!1,"Attribute",1,"WWColumn WWOptionalColumn");t.addBitmap(187,"PUBLICIDADIMAGEN",30,0,"px",17,"px",null,"","Imagen","ImageAttribute","WWColumn WWOptionalColumn");t.addCheckBox(188,31,"PUBLICIDADMENUAPP","Menu App","","PublicidadMenuApp","boolean","true","false",null,!0,!1,0,"px","WWColumn WWOptionalColumn");t.addCheckBox(189,32,"PUBLICIDADMENUWEB","Menu Web","","PublicidadMenuWeb","boolean","true","false",null,!0,!1,0,"px","WWColumn WWOptionalColumn");t.addCheckBox(190,33,"PUBLICIDADMOSTRARAPP","Mostrar App","","PublicidadMostrarApp","boolean","true","false",null,!0,!1,0,"px","WWColumn WWOptionalColumn");t.addCheckBox(191,34,"PUBLICIDADMOSTRARWEB","Mostrar Web","","PublicidadMostrarWeb","boolean","true","false",null,!0,!1,0,"px","WWColumn WWOptionalColumn");t.addSingleLineEdit("Update",35,"vUPDATE","","","Update","char",0,"px",20,20,"left",null,[],"Update","Update",!0,0,!1,!1,"TextActionAttribute",1,"WWTextActionColumn");t.addSingleLineEdit("Delete",36,"vDELETE","","","Delete","char",0,"px",20,20,"left",null,[],"Delete","Delete",!0,0,!1,!1,"TextActionAttribute",1,"WWTextActionColumn");this.GridContainer.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TABLETOP",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TITLETEXT",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"",grid:0};n[13]={id:13,fld:"BTNINSERT",grid:0,evt:"e110z2_client"};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"char",len:256,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.GridContainer],fld:"vPUBLICIDADTITULO",gxz:"ZV11PublicidadTitulo",gxold:"OV11PublicidadTitulo",gxvar:"AV11PublicidadTitulo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV11PublicidadTitulo=n)},v2z:function(n){n!==undefined&&(gx.O.ZV11PublicidadTitulo=n)},v2c:function(){gx.fn.setControlValue("vPUBLICIDADTITULO",gx.O.AV11PublicidadTitulo,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV11PublicidadTitulo=this.val())},val:function(){return gx.fn.getControlValue("vPUBLICIDADTITULO")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"GRIDCELL",grid:0};n[19]={id:19,fld:"GRIDTABLE",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[26]={id:26,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADID",gxz:"Z183PublicidadId",gxold:"O183PublicidadId",gxvar:"A183PublicidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A183PublicidadId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z183PublicidadId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("PUBLICIDADID",n||gx.fn.currentGridRowImpl(25),gx.O.A183PublicidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A183PublicidadId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("PUBLICIDADID",n||gx.fn.currentGridRowImpl(25),",")},nac:gx.falseFn};n[27]={id:27,lvl:2,type:"char",len:256,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADTITULO",gxz:"Z184PublicidadTitulo",gxold:"O184PublicidadTitulo",gxvar:"A184PublicidadTitulo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A184PublicidadTitulo=n)},v2z:function(n){n!==undefined&&(gx.O.Z184PublicidadTitulo=n)},v2c:function(n){gx.fn.setGridControlValue("PUBLICIDADTITULO",n||gx.fn.currentGridRowImpl(25),gx.O.A184PublicidadTitulo,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A184PublicidadTitulo=this.val(n))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADTITULO",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn};n[28]={id:28,lvl:2,type:"char",len:256,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADSUBTITULO",gxz:"Z185PublicidadSubTitulo",gxold:"O185PublicidadSubTitulo",gxvar:"A185PublicidadSubTitulo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A185PublicidadSubTitulo=n)},v2z:function(n){n!==undefined&&(gx.O.Z185PublicidadSubTitulo=n)},v2c:function(n){gx.fn.setGridControlValue("PUBLICIDADSUBTITULO",n||gx.fn.currentGridRowImpl(25),gx.O.A185PublicidadSubTitulo,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A185PublicidadSubTitulo=this.val(n))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADSUBTITULO",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn};n[29]={id:29,lvl:2,type:"char",len:256,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADDESCRIPCION",gxz:"Z186PublicidadDescripcion",gxold:"O186PublicidadDescripcion",gxvar:"A186PublicidadDescripcion",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A186PublicidadDescripcion=n)},v2z:function(n){n!==undefined&&(gx.O.Z186PublicidadDescripcion=n)},v2c:function(n){gx.fn.setGridControlValue("PUBLICIDADDESCRIPCION",n||gx.fn.currentGridRowImpl(25),gx.O.A186PublicidadDescripcion,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A186PublicidadDescripcion=this.val(n))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADDESCRIPCION",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn};n[30]={id:30,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADIMAGEN",gxz:"Z187PublicidadImagen",gxold:"O187PublicidadImagen",gxvar:"A187PublicidadImagen",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A187PublicidadImagen=n)},v2z:function(n){n!==undefined&&(gx.O.Z187PublicidadImagen=n)},v2c:function(n){gx.fn.setGridMultimediaValue("PUBLICIDADIMAGEN",n||gx.fn.currentGridRowImpl(25),gx.O.A187PublicidadImagen,gx.O.A40000PublicidadImagen_GXI)},c2v:function(n){gx.O.A40000PublicidadImagen_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.A187PublicidadImagen=this.val(n))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADIMAGEN",n||gx.fn.currentGridRowImpl(25))},val_GXI:function(n){return gx.fn.getGridControlValue("PUBLICIDADIMAGEN_GXI",n||gx.fn.currentGridRowImpl(25))},gxvar_GXI:"A40000PublicidadImagen_GXI",nac:gx.falseFn};n[31]={id:31,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMENUAPP",gxz:"Z188PublicidadMenuApp",gxold:"O188PublicidadMenuApp",gxvar:"A188PublicidadMenuApp",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A188PublicidadMenuApp=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z188PublicidadMenuApp=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("PUBLICIDADMENUAPP",n||gx.fn.currentGridRowImpl(25),gx.O.A188PublicidadMenuApp,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A188PublicidadMenuApp=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADMENUAPP",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn,values:["true","false"]};n[32]={id:32,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMENUWEB",gxz:"Z189PublicidadMenuWeb",gxold:"O189PublicidadMenuWeb",gxvar:"A189PublicidadMenuWeb",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A189PublicidadMenuWeb=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z189PublicidadMenuWeb=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("PUBLICIDADMENUWEB",n||gx.fn.currentGridRowImpl(25),gx.O.A189PublicidadMenuWeb,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A189PublicidadMenuWeb=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADMENUWEB",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn,values:["true","false"]};n[33]={id:33,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMOSTRARAPP",gxz:"Z190PublicidadMostrarApp",gxold:"O190PublicidadMostrarApp",gxvar:"A190PublicidadMostrarApp",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A190PublicidadMostrarApp=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z190PublicidadMostrarApp=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("PUBLICIDADMOSTRARAPP",n||gx.fn.currentGridRowImpl(25),gx.O.A190PublicidadMostrarApp,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A190PublicidadMostrarApp=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADMOSTRARAPP",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn,values:["true","false"]};n[34]={id:34,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMOSTRARWEB",gxz:"Z191PublicidadMostrarWeb",gxold:"O191PublicidadMostrarWeb",gxvar:"A191PublicidadMostrarWeb",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A191PublicidadMostrarWeb=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z191PublicidadMostrarWeb=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("PUBLICIDADMOSTRARWEB",n||gx.fn.currentGridRowImpl(25),gx.O.A191PublicidadMostrarWeb,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A191PublicidadMostrarWeb=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("PUBLICIDADMOSTRARWEB",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn,values:["true","false"]};n[35]={id:35,lvl:2,type:"char",len:20,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUPDATE",gxz:"ZV12Update",gxold:"OV12Update",gxvar:"AV12Update",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV12Update=n)},v2z:function(n){n!==undefined&&(gx.O.ZV12Update=n)},v2c:function(n){gx.fn.setGridControlValue("vUPDATE",n||gx.fn.currentGridRowImpl(25),gx.O.AV12Update,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV12Update=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vUPDATE",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn};n[36]={id:36,lvl:2,type:"char",len:20,dec:0,sign:!1,ro:1,isacc:0,grid:25,gxgrid:this.GridContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vDELETE",gxz:"ZV13Delete",gxold:"OV13Delete",gxvar:"AV13Delete",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV13Delete=n)},v2z:function(n){n!==undefined&&(gx.O.ZV13Delete=n)},v2c:function(n){gx.fn.setGridControlValue("vDELETE",n||gx.fn.currentGridRowImpl(25),gx.O.AV13Delete,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV13Delete=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vDELETE",n||gx.fn.currentGridRowImpl(25))},nac:gx.falseFn};this.AV11PublicidadTitulo="";this.ZV11PublicidadTitulo="";this.OV11PublicidadTitulo="";this.Z183PublicidadId=0;this.O183PublicidadId=0;this.Z184PublicidadTitulo="";this.O184PublicidadTitulo="";this.Z185PublicidadSubTitulo="";this.O185PublicidadSubTitulo="";this.Z186PublicidadDescripcion="";this.O186PublicidadDescripcion="";this.Z187PublicidadImagen="";this.O187PublicidadImagen="";this.Z188PublicidadMenuApp=!1;this.O188PublicidadMenuApp=!1;this.Z189PublicidadMenuWeb=!1;this.O189PublicidadMenuWeb=!1;this.Z190PublicidadMostrarApp=!1;this.O190PublicidadMostrarApp=!1;this.Z191PublicidadMostrarWeb=!1;this.O191PublicidadMostrarWeb=!1;this.ZV12Update="";this.OV12Update="";this.ZV13Delete="";this.OV13Delete="";this.AV11PublicidadTitulo="";this.A40000PublicidadImagen_GXI="";this.A183PublicidadId=0;this.A184PublicidadTitulo="";this.A185PublicidadSubTitulo="";this.A186PublicidadDescripcion="";this.A187PublicidadImagen="";this.A188PublicidadMenuApp=!1;this.A189PublicidadMenuWeb=!1;this.A190PublicidadMostrarApp=!1;this.A191PublicidadMostrarWeb=!1;this.AV12Update="";this.AV13Delete="";this.Events={e110z2_client:["'DOINSERT'",!0],e150z2_client:["ENTER",!0],e160z2_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[{av:"GRID_nFirstRecordOnPage"},{av:"GRID_nEOF"},{ctrl:"GRID",prop:"Rows"},{av:"AV11PublicidadTitulo",fld:"vPUBLICIDADTITULO",pic:""},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""}],[]];this.EvtParms.START=[[{av:"AV17Pgmname",fld:"vPGMNAME",pic:""}],[{ctrl:"GRID",prop:"Rows"},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""},{ctrl:"FORM",prop:"Caption"}]];this.EvtParms["GRID.LOAD"]=[[{av:"A183PublicidadId",fld:"PUBLICIDADID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0}],[{av:'gx.fn.getCtrlProperty("vUPDATE","Link")',ctrl:"vUPDATE",prop:"Link"},{av:'gx.fn.getCtrlProperty("vDELETE","Link")',ctrl:"vDELETE",prop:"Link"},{av:'gx.fn.getCtrlProperty("PUBLICIDADTITULO","Link")',ctrl:"PUBLICIDADTITULO",prop:"Link"}]];this.EvtParms["'DOINSERT'"]=[[{av:"A183PublicidadId",fld:"PUBLICIDADID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0}],[]];this.EvtParms.GRID_FIRSTPAGE=[[{av:"GRID_nFirstRecordOnPage"},{av:"GRID_nEOF"},{ctrl:"GRID",prop:"Rows"},{av:"AV11PublicidadTitulo",fld:"vPUBLICIDADTITULO",pic:""},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""}],[]];this.EvtParms.GRID_PREVPAGE=[[{av:"GRID_nFirstRecordOnPage"},{av:"GRID_nEOF"},{ctrl:"GRID",prop:"Rows"},{av:"AV11PublicidadTitulo",fld:"vPUBLICIDADTITULO",pic:""},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""}],[]];this.EvtParms.GRID_NEXTPAGE=[[{av:"GRID_nFirstRecordOnPage"},{av:"GRID_nEOF"},{ctrl:"GRID",prop:"Rows"},{av:"AV11PublicidadTitulo",fld:"vPUBLICIDADTITULO",pic:""},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""}],[]];this.EvtParms.GRID_LASTPAGE=[[{av:"GRID_nFirstRecordOnPage"},{av:"GRID_nEOF"},{ctrl:"GRID",prop:"Rows"},{av:"AV11PublicidadTitulo",fld:"vPUBLICIDADTITULO",pic:""},{av:"AV12Update",fld:"vUPDATE",pic:""},{av:"AV13Delete",fld:"vDELETE",pic:""}],[]];t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar({rfrVar:"AV12Update",rfrProp:"Value",gxAttId:"Update"});t.addRefreshingVar({rfrVar:"AV13Delete",rfrProp:"Value",gxAttId:"Delete"});t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm({rfrVar:"AV12Update",rfrProp:"Value",gxAttId:"Update"});t.addRefreshingParm({rfrVar:"AV13Delete",rfrProp:"Value",gxAttId:"Delete"});this.Initialize()});gx.wi(function(){gx.createParentObj(this.wwpublicidad)})