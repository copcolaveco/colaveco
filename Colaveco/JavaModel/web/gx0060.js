gx.evt.autoSkip=!1;gx.define("gx0060",!1,function(){var n,t;this.ServerClass="gx0060";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.gx0060";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV11pNotificacionesId=gx.fn.getIntegerValue("vPNOTIFICACIONESID",",")};this.Validv_Cnotificacionesfecha=function(){return this.validCliEvt("Validv_Cnotificacionesfecha",0,function(){try{var n=gx.util.balloon.getNew("vCNOTIFICACIONESFECHA");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.AV7cNotificacionesFecha)===0||new gx.date.gxdate(this.AV7cNotificacionesFecha).compare(gx.date.ymdhmstot(1e3,1,1,0,0,0))>=0))try{n.setError("Field Notificaciones Fecha is out of range");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e160e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle")),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e110e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCNOTIFICACIONESID","Visible",!0)):(gx.fn.setCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCNOTIFICACIONESID","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESID","Visible")',ctrl:"vCNOTIFICACIONESID",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e120e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?gx.fn.setCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"):gx.fn.setCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class","AdvancedContainerItem"),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESFECHAFILTERCONTAINER",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e130e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCNOTIFICACIONESTIPO","Visible",!0)):(gx.fn.setCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCNOTIFICACIONESTIPO","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESTIPOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESTIPO","Visible")',ctrl:"vCNOTIFICACIONESTIPO",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e140e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCNOTIFICACIONESIDNETUSUARIO","Visible",!0)):(gx.fn.setCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCNOTIFICACIONESIDNETUSUARIO","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESIDNETUSUARIO","Visible")',ctrl:"vCNOTIFICACIONESIDNETUSUARIO",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e150e1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCNOTIFICACIONESDETALLE","Visible",!0)):(gx.fn.setCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCNOTIFICACIONESDETALLE","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESDETALLEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESDETALLE","Visible")',ctrl:"vCNOTIFICACIONESDETALLE",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e190e2_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e200e1_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,65,66,67,68,69,70,71,72];this.GXLastCtrlId=72;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",64,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0060",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px",0,"px","New row",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",65,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(6,66,"NOTIFICACIONESID","Id","","NotificacionesId","int",0,"px",18,18,"right",null,[],6,"NotificacionesId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(169,67,"NOTIFICACIONESFECHA","Fecha","","NotificacionesFecha","dtime",0,"px",17,17,"right",null,[],169,"NotificacionesFecha",!0,5,!1,!1,"DescriptionAttribute",1,"WWColumn");t.addSingleLineEdit(170,68,"NOTIFICACIONESTIPO","Tipo","","NotificacionesTipo","svchar",0,"px",40,40,"left",null,[],170,"NotificacionesTipo",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(172,69,"NOTIFICACIONESIDNETUSUARIO","Net Usuario","","NotificacionesIdNetUsuario","int",0,"px",18,18,"right",null,[],172,"NotificacionesIdNetUsuario",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAIN",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"ADVANCEDCONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"NOTIFICACIONESIDFILTERCONTAINER",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"LBLNOTIFICACIONESIDFILTER",format:1,grid:0,evt:"e110e1_client",ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCNOTIFICACIONESID",gxz:"ZV6cNotificacionesId",gxold:"OV6cNotificacionesId",gxvar:"AV6cNotificacionesId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cNotificacionesId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cNotificacionesId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCNOTIFICACIONESID",gx.O.AV6cNotificacionesId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cNotificacionesId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCNOTIFICACIONESID",",")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"NOTIFICACIONESFECHAFILTERCONTAINER",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"LBLNOTIFICACIONESFECHAFILTER",format:1,grid:0,evt:"e120e1_client",ctrltype:"textblock"};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Cnotificacionesfecha,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCNOTIFICACIONESFECHA",gxz:"ZV7cNotificacionesFecha",gxold:"OV7cNotificacionesFecha",gxvar:"AV7cNotificacionesFecha",dp:{f:-1,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[26],ip:[26],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cNotificacionesFecha=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cNotificacionesFecha=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCNOTIFICACIONESFECHA",gx.O.AV7cNotificacionesFecha,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cNotificacionesFecha=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("vCNOTIFICACIONESFECHA")},nac:gx.falseFn};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"NOTIFICACIONESTIPOFILTERCONTAINER",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"LBLNOTIFICACIONESTIPOFILTER",format:1,grid:0,evt:"e130e1_client",ctrltype:"textblock"};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,lvl:0,type:"svchar",len:40,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCNOTIFICACIONESTIPO",gxz:"ZV8cNotificacionesTipo",gxold:"OV8cNotificacionesTipo",gxvar:"AV8cNotificacionesTipo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV8cNotificacionesTipo=n)},v2z:function(n){n!==undefined&&(gx.O.ZV8cNotificacionesTipo=n)},v2c:function(){gx.fn.setControlValue("vCNOTIFICACIONESTIPO",gx.O.AV8cNotificacionesTipo,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV8cNotificacionesTipo=this.val())},val:function(){return gx.fn.getControlValue("vCNOTIFICACIONESTIPO")},nac:gx.falseFn};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"LBLNOTIFICACIONESIDNETUSUARIOFILTER",format:1,grid:0,evt:"e140e1_client",ctrltype:"textblock"};n[43]={id:43,fld:"",grid:0};n[44]={id:44,fld:"",grid:0};n[45]={id:45,fld:"",grid:0};n[46]={id:46,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCNOTIFICACIONESIDNETUSUARIO",gxz:"ZV9cNotificacionesIdNetUsuario",gxold:"OV9cNotificacionesIdNetUsuario",gxvar:"AV9cNotificacionesIdNetUsuario",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV9cNotificacionesIdNetUsuario=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV9cNotificacionesIdNetUsuario=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCNOTIFICACIONESIDNETUSUARIO",gx.O.AV9cNotificacionesIdNetUsuario,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV9cNotificacionesIdNetUsuario=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCNOTIFICACIONESIDNETUSUARIO",",")},nac:gx.falseFn};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,fld:"NOTIFICACIONESDETALLEFILTERCONTAINER",grid:0};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"LBLNOTIFICACIONESDETALLEFILTER",format:1,grid:0,evt:"e150e1_client",ctrltype:"textblock"};n[53]={id:53,fld:"",grid:0};n[54]={id:54,fld:"",grid:0};n[55]={id:55,fld:"",grid:0};n[56]={id:56,lvl:0,type:"svchar",len:40,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCNOTIFICACIONESDETALLE",gxz:"ZV10cNotificacionesDetalle",gxold:"OV10cNotificacionesDetalle",gxvar:"AV10cNotificacionesDetalle",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV10cNotificacionesDetalle=n)},v2z:function(n){n!==undefined&&(gx.O.ZV10cNotificacionesDetalle=n)},v2c:function(){gx.fn.setControlValue("vCNOTIFICACIONESDETALLE",gx.O.AV10cNotificacionesDetalle,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV10cNotificacionesDetalle=this.val())},val:function(){return gx.fn.getControlValue("vCNOTIFICACIONESDETALLE")},nac:gx.falseFn};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"GRIDTABLE",grid:0};n[59]={id:59,fld:"",grid:0};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"BTNTOGGLE",grid:0,evt:"e160e1_client"};n[62]={id:62,fld:"",grid:0};n[63]={id:63,fld:"",grid:0};n[65]={id:65,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(64),gx.O.AV5LinkSelection,gx.O.AV15Linkselection_GXI)},c2v:function(n){gx.O.AV15Linkselection_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV5LinkSelection=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(64))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(64))},gxvar_GXI:"AV15Linkselection_GXI",nac:gx.falseFn};n[66]={id:66,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESID",gxz:"Z6NotificacionesId",gxold:"O6NotificacionesId",gxvar:"A6NotificacionesId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A6NotificacionesId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z6NotificacionesId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("NOTIFICACIONESID",n||gx.fn.currentGridRowImpl(64),gx.O.A6NotificacionesId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A6NotificacionesId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("NOTIFICACIONESID",n||gx.fn.currentGridRowImpl(64),",")},nac:gx.falseFn};n[67]={id:67,lvl:2,type:"dtime",len:8,dec:5,sign:!1,ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESFECHA",gxz:"Z169NotificacionesFecha",gxold:"O169NotificacionesFecha",gxvar:"A169NotificacionesFecha",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A169NotificacionesFecha=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z169NotificacionesFecha=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("NOTIFICACIONESFECHA",n||gx.fn.currentGridRowImpl(64),gx.O.A169NotificacionesFecha,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A169NotificacionesFecha=gx.fn.toDatetimeValue(this.val(n)))},val:function(n){return gx.fn.getGridDateTimeValue("NOTIFICACIONESFECHA",n||gx.fn.currentGridRowImpl(64))},nac:gx.falseFn};n[68]={id:68,lvl:2,type:"svchar",len:40,dec:0,sign:!1,ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESTIPO",gxz:"Z170NotificacionesTipo",gxold:"O170NotificacionesTipo",gxvar:"A170NotificacionesTipo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A170NotificacionesTipo=n)},v2z:function(n){n!==undefined&&(gx.O.Z170NotificacionesTipo=n)},v2c:function(n){gx.fn.setGridControlValue("NOTIFICACIONESTIPO",n||gx.fn.currentGridRowImpl(64),gx.O.A170NotificacionesTipo,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A170NotificacionesTipo=this.val(n))},val:function(n){return gx.fn.getGridControlValue("NOTIFICACIONESTIPO",n||gx.fn.currentGridRowImpl(64))},nac:gx.falseFn};n[69]={id:69,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:64,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESIDNETUSUARIO",gxz:"Z172NotificacionesIdNetUsuario",gxold:"O172NotificacionesIdNetUsuario",gxvar:"A172NotificacionesIdNetUsuario",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A172NotificacionesIdNetUsuario=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z172NotificacionesIdNetUsuario=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("NOTIFICACIONESIDNETUSUARIO",n||gx.fn.currentGridRowImpl(64),gx.O.A172NotificacionesIdNetUsuario,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A172NotificacionesIdNetUsuario=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("NOTIFICACIONESIDNETUSUARIO",n||gx.fn.currentGridRowImpl(64),",")},nac:gx.falseFn};n[70]={id:70,fld:"",grid:0};n[71]={id:71,fld:"",grid:0};n[72]={id:72,fld:"BTN_CANCEL",grid:0,evt:"e200e1_client"};this.AV6cNotificacionesId=0;this.ZV6cNotificacionesId=0;this.OV6cNotificacionesId=0;this.AV7cNotificacionesFecha=gx.date.nullDate();this.ZV7cNotificacionesFecha=gx.date.nullDate();this.OV7cNotificacionesFecha=gx.date.nullDate();this.AV8cNotificacionesTipo="";this.ZV8cNotificacionesTipo="";this.OV8cNotificacionesTipo="";this.AV9cNotificacionesIdNetUsuario=0;this.ZV9cNotificacionesIdNetUsuario=0;this.OV9cNotificacionesIdNetUsuario=0;this.AV10cNotificacionesDetalle="";this.ZV10cNotificacionesDetalle="";this.OV10cNotificacionesDetalle="";this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z6NotificacionesId=0;this.O6NotificacionesId=0;this.Z169NotificacionesFecha=gx.date.nullDate();this.O169NotificacionesFecha=gx.date.nullDate();this.Z170NotificacionesTipo="";this.O170NotificacionesTipo="";this.Z172NotificacionesIdNetUsuario=0;this.O172NotificacionesIdNetUsuario=0;this.AV6cNotificacionesId=0;this.AV7cNotificacionesFecha=gx.date.nullDate();this.AV8cNotificacionesTipo="";this.AV9cNotificacionesIdNetUsuario=0;this.AV10cNotificacionesDetalle="";this.AV11pNotificacionesId=0;this.A173NotificacionesDetalle="";this.AV5LinkSelection="";this.A6NotificacionesId=0;this.A169NotificacionesFecha=gx.date.nullDate();this.A170NotificacionesTipo="";this.A172NotificacionesIdNetUsuario=0;this.Events={e190e2_client:["ENTER",!0],e200e1_client:["CANCEL",!0],e160e1_client:["'TOGGLE'",!1],e110e1_client:["LBLNOTIFICACIONESIDFILTER.CLICK",!1],e120e1_client:["LBLNOTIFICACIONESFECHAFILTER.CLICK",!1],e130e1_client:["LBLNOTIFICACIONESTIPOFILTER.CLICK",!1],e140e1_client:["LBLNOTIFICACIONESIDNETUSUARIOFILTER.CLICK",!1],e150e1_client:["LBLNOTIFICACIONESDETALLEFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cNotificacionesId",fld:"vCNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cNotificacionesFecha",fld:"vCNOTIFICACIONESFECHA",pic:"99/99/99 99:99"},{av:"AV8cNotificacionesTipo",fld:"vCNOTIFICACIONESTIPO",pic:""},{av:"AV9cNotificacionesIdNetUsuario",fld:"vCNOTIFICACIONESIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cNotificacionesDetalle",fld:"vCNOTIFICACIONESDETALLE",pic:""}],[]];this.EvtParms.START=[[],[{ctrl:"FORM",prop:"Caption"}]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLNOTIFICACIONESIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESID","Visible")',ctrl:"vCNOTIFICACIONESID",prop:"Visible"}]];this.EvtParms["LBLNOTIFICACIONESFECHAFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESFECHAFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESFECHAFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESFECHAFILTERCONTAINER",prop:"Class"}]];this.EvtParms["LBLNOTIFICACIONESTIPOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESTIPOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESTIPOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESTIPOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESTIPO","Visible")',ctrl:"vCNOTIFICACIONESTIPO",prop:"Visible"}]];this.EvtParms["LBLNOTIFICACIONESIDNETUSUARIOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESIDNETUSUARIO","Visible")',ctrl:"vCNOTIFICACIONESIDNETUSUARIO",prop:"Visible"}]];this.EvtParms["LBLNOTIFICACIONESDETALLEFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESDETALLEFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("NOTIFICACIONESDETALLEFILTERCONTAINER","Class")',ctrl:"NOTIFICACIONESDETALLEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCNOTIFICACIONESDETALLE","Visible")',ctrl:"vCNOTIFICACIONESDETALLE",prop:"Visible"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION",pic:""}]];this.EvtParms.ENTER=[[{av:"A6NotificacionesId",fld:"NOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0}],[{av:"AV11pNotificacionesId",fld:"vPNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cNotificacionesId",fld:"vCNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cNotificacionesFecha",fld:"vCNOTIFICACIONESFECHA",pic:"99/99/99 99:99"},{av:"AV8cNotificacionesTipo",fld:"vCNOTIFICACIONESTIPO",pic:""},{av:"AV9cNotificacionesIdNetUsuario",fld:"vCNOTIFICACIONESIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cNotificacionesDetalle",fld:"vCNOTIFICACIONESDETALLE",pic:""}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cNotificacionesId",fld:"vCNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cNotificacionesFecha",fld:"vCNOTIFICACIONESFECHA",pic:"99/99/99 99:99"},{av:"AV8cNotificacionesTipo",fld:"vCNOTIFICACIONESTIPO",pic:""},{av:"AV9cNotificacionesIdNetUsuario",fld:"vCNOTIFICACIONESIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cNotificacionesDetalle",fld:"vCNOTIFICACIONESDETALLE",pic:""}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cNotificacionesId",fld:"vCNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cNotificacionesFecha",fld:"vCNOTIFICACIONESFECHA",pic:"99/99/99 99:99"},{av:"AV8cNotificacionesTipo",fld:"vCNOTIFICACIONESTIPO",pic:""},{av:"AV9cNotificacionesIdNetUsuario",fld:"vCNOTIFICACIONESIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cNotificacionesDetalle",fld:"vCNOTIFICACIONESDETALLE",pic:""}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cNotificacionesId",fld:"vCNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cNotificacionesFecha",fld:"vCNOTIFICACIONESFECHA",pic:"99/99/99 99:99"},{av:"AV8cNotificacionesTipo",fld:"vCNOTIFICACIONESTIPO",pic:""},{av:"AV9cNotificacionesIdNetUsuario",fld:"vCNOTIFICACIONESIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cNotificacionesDetalle",fld:"vCNOTIFICACIONESDETALLE",pic:""}],[]];this.EvtParms.VALIDV_CNOTIFICACIONESFECHA=[[],[]];this.setVCMap("AV11pNotificacionesId","vPNOTIFICACIONESID",0,"int",18,0);t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid1"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm(this.GXValidFnc[26]);t.addRefreshingParm(this.GXValidFnc[36]);t.addRefreshingParm(this.GXValidFnc[46]);t.addRefreshingParm(this.GXValidFnc[56]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gx0060)})