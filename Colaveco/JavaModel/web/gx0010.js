gx.evt.autoSkip=!1;gx.define("gx0010",!1,function(){var n,t;this.ServerClass="gx0010";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.gx0010";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV13presultadoId=gx.fn.getIntegerValue("vPRESULTADOID",",")};this.Validv_Cresultadofechacreado=function(){return this.validCliEvt("Validv_Cresultadofechacreado",0,function(){try{var n=gx.util.balloon.getNew("vCRESULTADOFECHACREADO");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.AV12cresultadoFechaCreado)===0||new gx.date.gxdate(this.AV12cresultadoFechaCreado).compare(gx.date.ymdtod(1e3,1,1))>=0))try{n.setError("Field resultado Fecha Creado is out of range");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e18091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle")),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e11091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOIDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOID","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOID","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOIDFILTERCONTAINER","Class")',ctrl:"RESULTADOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOID","Visible")',ctrl:"vCRESULTADOID",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e12091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOFICHA","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOFICHA","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class")',ctrl:"RESULTADOFICHAFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOFICHA","Visible")',ctrl:"vCRESULTADOFICHA",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e13091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOCOMENTARIOS","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOCOMENTARIOS","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class")',ctrl:"RESULTADOCOMENTARIOSFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOCOMENTARIOS","Visible")',ctrl:"vCRESULTADOCOMENTARIOS",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e14091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOUSERID","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOUSERID","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class")',ctrl:"RESULTADOUSERIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOUSERID","Visible")',ctrl:"vCRESULTADOUSERID",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e15091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOTYPEID","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOTYPEID","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class")',ctrl:"RESULTADOTYPEIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOTYPEID","Visible")',ctrl:"vCRESULTADOTYPEID",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e16091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCRESULTADOIDNETUSUARIO","Visible",!0)):(gx.fn.setCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCRESULTADOIDNETUSUARIO","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"RESULTADOIDNETUSUARIOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOIDNETUSUARIO","Visible")',ctrl:"vCRESULTADOIDNETUSUARIO",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e17091_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?gx.fn.setCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"):gx.fn.setCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class","AdvancedContainerItem"),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class")',ctrl:"RESULTADOFECHACREADOFILTERCONTAINER",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e21092_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e22091_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93];this.GXLastCtrlId=93;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0010",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px",0,"px","New row",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(1,86,"RESULTADOID","Id","","resultadoId","int",0,"px",18,18,"right",null,[],1,"resultadoId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(7,87,"RESULTADOFICHA","Ficha","","resultadoFicha","int",0,"px",18,18,"right",null,[],7,"resultadoFicha",!0,0,!1,!1,"DescriptionAttribute",1,"WWColumn");t.addSingleLineEdit(8,88,"RESULTADOCOMENTARIOS","Comentarios","","resultadoComentarios","svchar",0,"px",45,45,"left",null,[],8,"resultadoComentarios",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(9,89,"RESULTADOUSERID","User Id","","resultadoUserId","int",0,"px",18,18,"right",null,[],9,"resultadoUserId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(10,90,"RESULTADOTYPEID","Type Id","","resultadoTypeId","int",0,"px",18,18,"right",null,[],10,"resultadoTypeId",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAIN",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"ADVANCEDCONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"RESULTADOIDFILTERCONTAINER",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"LBLRESULTADOIDFILTER",format:1,grid:0,evt:"e11091_client",ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOID",gxz:"ZV6cresultadoId",gxold:"OV6cresultadoId",gxvar:"AV6cresultadoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cresultadoId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cresultadoId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOID",gx.O.AV6cresultadoId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cresultadoId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCRESULTADOID",",")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"RESULTADOFICHAFILTERCONTAINER",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"LBLRESULTADOFICHAFILTER",format:1,grid:0,evt:"e12091_client",ctrltype:"textblock"};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOFICHA",gxz:"ZV7cresultadoFicha",gxold:"OV7cresultadoFicha",gxvar:"AV7cresultadoFicha",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cresultadoFicha=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cresultadoFicha=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOFICHA",gx.O.AV7cresultadoFicha,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cresultadoFicha=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCRESULTADOFICHA",",")},nac:gx.falseFn};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"RESULTADOCOMENTARIOSFILTERCONTAINER",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"LBLRESULTADOCOMENTARIOSFILTER",format:1,grid:0,evt:"e13091_client",ctrltype:"textblock"};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,lvl:0,type:"svchar",len:45,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOCOMENTARIOS",gxz:"ZV8cresultadoComentarios",gxold:"OV8cresultadoComentarios",gxvar:"AV8cresultadoComentarios",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV8cresultadoComentarios=n)},v2z:function(n){n!==undefined&&(gx.O.ZV8cresultadoComentarios=n)},v2c:function(){gx.fn.setControlValue("vCRESULTADOCOMENTARIOS",gx.O.AV8cresultadoComentarios,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV8cresultadoComentarios=this.val())},val:function(){return gx.fn.getControlValue("vCRESULTADOCOMENTARIOS")},nac:gx.falseFn};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"RESULTADOUSERIDFILTERCONTAINER",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"LBLRESULTADOUSERIDFILTER",format:1,grid:0,evt:"e14091_client",ctrltype:"textblock"};n[43]={id:43,fld:"",grid:0};n[44]={id:44,fld:"",grid:0};n[45]={id:45,fld:"",grid:0};n[46]={id:46,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOUSERID",gxz:"ZV9cresultadoUserId",gxold:"OV9cresultadoUserId",gxvar:"AV9cresultadoUserId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV9cresultadoUserId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV9cresultadoUserId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOUSERID",gx.O.AV9cresultadoUserId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV9cresultadoUserId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCRESULTADOUSERID",",")},nac:gx.falseFn};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,fld:"RESULTADOTYPEIDFILTERCONTAINER",grid:0};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"LBLRESULTADOTYPEIDFILTER",format:1,grid:0,evt:"e15091_client",ctrltype:"textblock"};n[53]={id:53,fld:"",grid:0};n[54]={id:54,fld:"",grid:0};n[55]={id:55,fld:"",grid:0};n[56]={id:56,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOTYPEID",gxz:"ZV10cresultadoTypeId",gxold:"OV10cresultadoTypeId",gxvar:"AV10cresultadoTypeId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV10cresultadoTypeId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV10cresultadoTypeId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOTYPEID",gx.O.AV10cresultadoTypeId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV10cresultadoTypeId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCRESULTADOTYPEID",",")},nac:gx.falseFn};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,fld:"RESULTADOIDNETUSUARIOFILTERCONTAINER",grid:0};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"",grid:0};n[62]={id:62,fld:"LBLRESULTADOIDNETUSUARIOFILTER",format:1,grid:0,evt:"e16091_client",ctrltype:"textblock"};n[63]={id:63,fld:"",grid:0};n[64]={id:64,fld:"",grid:0};n[65]={id:65,fld:"",grid:0};n[66]={id:66,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOIDNETUSUARIO",gxz:"ZV11cresultadoIdNetUsuario",gxold:"OV11cresultadoIdNetUsuario",gxvar:"AV11cresultadoIdNetUsuario",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV11cresultadoIdNetUsuario=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV11cresultadoIdNetUsuario=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOIDNETUSUARIO",gx.O.AV11cresultadoIdNetUsuario,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV11cresultadoIdNetUsuario=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCRESULTADOIDNETUSUARIO",",")},nac:gx.falseFn};n[67]={id:67,fld:"",grid:0};n[68]={id:68,fld:"",grid:0};n[69]={id:69,fld:"RESULTADOFECHACREADOFILTERCONTAINER",grid:0};n[70]={id:70,fld:"",grid:0};n[71]={id:71,fld:"",grid:0};n[72]={id:72,fld:"LBLRESULTADOFECHACREADOFILTER",format:1,grid:0,evt:"e17091_client",ctrltype:"textblock"};n[73]={id:73,fld:"",grid:0};n[74]={id:74,fld:"",grid:0};n[75]={id:75,fld:"",grid:0};n[76]={id:76,lvl:0,type:"date",len:8,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Cresultadofechacreado,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCRESULTADOFECHACREADO",gxz:"ZV12cresultadoFechaCreado",gxold:"OV12cresultadoFechaCreado",gxvar:"AV12cresultadoFechaCreado",dp:{f:-1,st:!1,wn:!1,mf:!1,pic:"99/99/99",dec:0},ucs:[],op:[76],ip:[76],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV12cresultadoFechaCreado=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV12cresultadoFechaCreado=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCRESULTADOFECHACREADO",gx.O.AV12cresultadoFechaCreado,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV12cresultadoFechaCreado=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getControlValue("vCRESULTADOFECHACREADO")},nac:gx.falseFn};n[77]={id:77,fld:"",grid:0};n[78]={id:78,fld:"GRIDTABLE",grid:0};n[79]={id:79,fld:"",grid:0};n[80]={id:80,fld:"",grid:0};n[81]={id:81,fld:"BTNTOGGLE",grid:0,evt:"e18091_client"};n[82]={id:82,fld:"",grid:0};n[83]={id:83,fld:"",grid:0};n[85]={id:85,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV17Linkselection_GXI)},c2v:function(n){gx.O.AV17Linkselection_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV5LinkSelection=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(84))},gxvar_GXI:"AV17Linkselection_GXI",nac:gx.falseFn};n[86]={id:86,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RESULTADOID",gxz:"Z1resultadoId",gxold:"O1resultadoId",gxvar:"A1resultadoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A1resultadoId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z1resultadoId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("RESULTADOID",n||gx.fn.currentGridRowImpl(84),gx.O.A1resultadoId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A1resultadoId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("RESULTADOID",n||gx.fn.currentGridRowImpl(84),",")},nac:gx.falseFn};n[87]={id:87,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RESULTADOFICHA",gxz:"Z7resultadoFicha",gxold:"O7resultadoFicha",gxvar:"A7resultadoFicha",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A7resultadoFicha=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z7resultadoFicha=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("RESULTADOFICHA",n||gx.fn.currentGridRowImpl(84),gx.O.A7resultadoFicha,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A7resultadoFicha=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("RESULTADOFICHA",n||gx.fn.currentGridRowImpl(84),",")},nac:gx.falseFn};n[88]={id:88,lvl:2,type:"svchar",len:45,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RESULTADOCOMENTARIOS",gxz:"Z8resultadoComentarios",gxold:"O8resultadoComentarios",gxvar:"A8resultadoComentarios",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A8resultadoComentarios=n)},v2z:function(n){n!==undefined&&(gx.O.Z8resultadoComentarios=n)},v2c:function(n){gx.fn.setGridControlValue("RESULTADOCOMENTARIOS",n||gx.fn.currentGridRowImpl(84),gx.O.A8resultadoComentarios,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A8resultadoComentarios=this.val(n))},val:function(n){return gx.fn.getGridControlValue("RESULTADOCOMENTARIOS",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[89]={id:89,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RESULTADOUSERID",gxz:"Z9resultadoUserId",gxold:"O9resultadoUserId",gxvar:"A9resultadoUserId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A9resultadoUserId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z9resultadoUserId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("RESULTADOUSERID",n||gx.fn.currentGridRowImpl(84),gx.O.A9resultadoUserId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A9resultadoUserId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("RESULTADOUSERID",n||gx.fn.currentGridRowImpl(84),",")},nac:gx.falseFn};n[90]={id:90,lvl:2,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RESULTADOTYPEID",gxz:"Z10resultadoTypeId",gxold:"O10resultadoTypeId",gxvar:"A10resultadoTypeId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A10resultadoTypeId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z10resultadoTypeId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("RESULTADOTYPEID",n||gx.fn.currentGridRowImpl(84),gx.O.A10resultadoTypeId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A10resultadoTypeId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("RESULTADOTYPEID",n||gx.fn.currentGridRowImpl(84),",")},nac:gx.falseFn};n[91]={id:91,fld:"",grid:0};n[92]={id:92,fld:"",grid:0};n[93]={id:93,fld:"BTN_CANCEL",grid:0,evt:"e22091_client"};this.AV6cresultadoId=0;this.ZV6cresultadoId=0;this.OV6cresultadoId=0;this.AV7cresultadoFicha=0;this.ZV7cresultadoFicha=0;this.OV7cresultadoFicha=0;this.AV8cresultadoComentarios="";this.ZV8cresultadoComentarios="";this.OV8cresultadoComentarios="";this.AV9cresultadoUserId=0;this.ZV9cresultadoUserId=0;this.OV9cresultadoUserId=0;this.AV10cresultadoTypeId=0;this.ZV10cresultadoTypeId=0;this.OV10cresultadoTypeId=0;this.AV11cresultadoIdNetUsuario=0;this.ZV11cresultadoIdNetUsuario=0;this.OV11cresultadoIdNetUsuario=0;this.AV12cresultadoFechaCreado=gx.date.nullDate();this.ZV12cresultadoFechaCreado=gx.date.nullDate();this.OV12cresultadoFechaCreado=gx.date.nullDate();this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z1resultadoId=0;this.O1resultadoId=0;this.Z7resultadoFicha=0;this.O7resultadoFicha=0;this.Z8resultadoComentarios="";this.O8resultadoComentarios="";this.Z9resultadoUserId=0;this.O9resultadoUserId=0;this.Z10resultadoTypeId=0;this.O10resultadoTypeId=0;this.AV6cresultadoId=0;this.AV7cresultadoFicha=0;this.AV8cresultadoComentarios="";this.AV9cresultadoUserId=0;this.AV10cresultadoTypeId=0;this.AV11cresultadoIdNetUsuario=0;this.AV12cresultadoFechaCreado=gx.date.nullDate();this.AV13presultadoId=0;this.A12resultadoFechaCreado=gx.date.nullDate();this.A11resultadoIdNetUsuario=0;this.AV5LinkSelection="";this.A1resultadoId=0;this.A7resultadoFicha=0;this.A8resultadoComentarios="";this.A9resultadoUserId=0;this.A10resultadoTypeId=0;this.Events={e21092_client:["ENTER",!0],e22091_client:["CANCEL",!0],e18091_client:["'TOGGLE'",!1],e11091_client:["LBLRESULTADOIDFILTER.CLICK",!1],e12091_client:["LBLRESULTADOFICHAFILTER.CLICK",!1],e13091_client:["LBLRESULTADOCOMENTARIOSFILTER.CLICK",!1],e14091_client:["LBLRESULTADOUSERIDFILTER.CLICK",!1],e15091_client:["LBLRESULTADOTYPEIDFILTER.CLICK",!1],e16091_client:["LBLRESULTADOIDNETUSUARIOFILTER.CLICK",!1],e17091_client:["LBLRESULTADOFECHACREADOFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cresultadoId",fld:"vCRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cresultadoFicha",fld:"vCRESULTADOFICHA",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV8cresultadoComentarios",fld:"vCRESULTADOCOMENTARIOS",pic:""},{av:"AV9cresultadoUserId",fld:"vCRESULTADOUSERID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cresultadoTypeId",fld:"vCRESULTADOTYPEID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV11cresultadoIdNetUsuario",fld:"vCRESULTADOIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV12cresultadoFechaCreado",fld:"vCRESULTADOFECHACREADO",pic:""}],[]];this.EvtParms.START=[[],[{ctrl:"FORM",prop:"Caption"}]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLRESULTADOIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOIDFILTERCONTAINER","Class")',ctrl:"RESULTADOIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOIDFILTERCONTAINER","Class")',ctrl:"RESULTADOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOID","Visible")',ctrl:"vCRESULTADOID",prop:"Visible"}]];this.EvtParms["LBLRESULTADOFICHAFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class")',ctrl:"RESULTADOFICHAFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOFICHAFILTERCONTAINER","Class")',ctrl:"RESULTADOFICHAFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOFICHA","Visible")',ctrl:"vCRESULTADOFICHA",prop:"Visible"}]];this.EvtParms["LBLRESULTADOCOMENTARIOSFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class")',ctrl:"RESULTADOCOMENTARIOSFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOCOMENTARIOSFILTERCONTAINER","Class")',ctrl:"RESULTADOCOMENTARIOSFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOCOMENTARIOS","Visible")',ctrl:"vCRESULTADOCOMENTARIOS",prop:"Visible"}]];this.EvtParms["LBLRESULTADOUSERIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class")',ctrl:"RESULTADOUSERIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOUSERIDFILTERCONTAINER","Class")',ctrl:"RESULTADOUSERIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOUSERID","Visible")',ctrl:"vCRESULTADOUSERID",prop:"Visible"}]];this.EvtParms["LBLRESULTADOTYPEIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class")',ctrl:"RESULTADOTYPEIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOTYPEIDFILTERCONTAINER","Class")',ctrl:"RESULTADOTYPEIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOTYPEID","Visible")',ctrl:"vCRESULTADOTYPEID",prop:"Visible"}]];this.EvtParms["LBLRESULTADOIDNETUSUARIOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"RESULTADOIDNETUSUARIOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOIDNETUSUARIOFILTERCONTAINER","Class")',ctrl:"RESULTADOIDNETUSUARIOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCRESULTADOIDNETUSUARIO","Visible")',ctrl:"vCRESULTADOIDNETUSUARIO",prop:"Visible"}]];this.EvtParms["LBLRESULTADOFECHACREADOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class")',ctrl:"RESULTADOFECHACREADOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("RESULTADOFECHACREADOFILTERCONTAINER","Class")',ctrl:"RESULTADOFECHACREADOFILTERCONTAINER",prop:"Class"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION",pic:""}]];this.EvtParms.ENTER=[[{av:"A1resultadoId",fld:"RESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0}],[{av:"AV13presultadoId",fld:"vPRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cresultadoId",fld:"vCRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cresultadoFicha",fld:"vCRESULTADOFICHA",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV8cresultadoComentarios",fld:"vCRESULTADOCOMENTARIOS",pic:""},{av:"AV9cresultadoUserId",fld:"vCRESULTADOUSERID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cresultadoTypeId",fld:"vCRESULTADOTYPEID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV11cresultadoIdNetUsuario",fld:"vCRESULTADOIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV12cresultadoFechaCreado",fld:"vCRESULTADOFECHACREADO",pic:""}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cresultadoId",fld:"vCRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cresultadoFicha",fld:"vCRESULTADOFICHA",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV8cresultadoComentarios",fld:"vCRESULTADOCOMENTARIOS",pic:""},{av:"AV9cresultadoUserId",fld:"vCRESULTADOUSERID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cresultadoTypeId",fld:"vCRESULTADOTYPEID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV11cresultadoIdNetUsuario",fld:"vCRESULTADOIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV12cresultadoFechaCreado",fld:"vCRESULTADOFECHACREADO",pic:""}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cresultadoId",fld:"vCRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cresultadoFicha",fld:"vCRESULTADOFICHA",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV8cresultadoComentarios",fld:"vCRESULTADOCOMENTARIOS",pic:""},{av:"AV9cresultadoUserId",fld:"vCRESULTADOUSERID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cresultadoTypeId",fld:"vCRESULTADOTYPEID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV11cresultadoIdNetUsuario",fld:"vCRESULTADOIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV12cresultadoFechaCreado",fld:"vCRESULTADOFECHACREADO",pic:""}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cresultadoId",fld:"vCRESULTADOID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV7cresultadoFicha",fld:"vCRESULTADOFICHA",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV8cresultadoComentarios",fld:"vCRESULTADOCOMENTARIOS",pic:""},{av:"AV9cresultadoUserId",fld:"vCRESULTADOUSERID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV10cresultadoTypeId",fld:"vCRESULTADOTYPEID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV11cresultadoIdNetUsuario",fld:"vCRESULTADOIDNETUSUARIO",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"AV12cresultadoFechaCreado",fld:"vCRESULTADOFECHACREADO",pic:""}],[]];this.EvtParms.VALIDV_CRESULTADOFECHACREADO=[[],[]];this.setVCMap("AV13presultadoId","vPRESULTADOID",0,"int",18,0);t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid1"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingVar(this.GXValidFnc[66]);t.addRefreshingVar(this.GXValidFnc[76]);t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm(this.GXValidFnc[26]);t.addRefreshingParm(this.GXValidFnc[36]);t.addRefreshingParm(this.GXValidFnc[46]);t.addRefreshingParm(this.GXValidFnc[56]);t.addRefreshingParm(this.GXValidFnc[66]);t.addRefreshingParm(this.GXValidFnc[76]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gx0010)})