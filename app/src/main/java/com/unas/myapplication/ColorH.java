package com.unas.myapplication;

/**
 * Created by aaahh on 8/26/14.
 */
public class ColorH {
    public static String getH()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        do
        {
            if (i >= 200)
            {
                String s = (new StringBuilder(String.valueOf(""))).append("<html>").append("   \t\t<head>").append("   \t\t<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>").append("   \t\t<meta name='viewport' content='user-scalable=no, initial-scale=1.0, maximum-scale=1, minimum-scale=1, width=device-width'>").append("   \t\t<meta name='apple-mobile-web-app-capable' content='yes'>").append("   \t\t<meta name='apple-mobile-web-app-status-bar-style' content='black'>").append("\t\t<style>").append(com.unas.myapplication.CCS.getH()).append("</style>").append("</head>").append("<body bgcolor=black>").append(" ").append("<TABLE width=100%>").append("<TR>").append("\t<TD  width=10%>").append("\t<div id=divBir></div>").append("</TD>").toString();
                String s1 = Common.BgColor;
                if (Common.ColorType == 1)
                {
                    s1 = Common.FgColor;
                }
                int j = Common.cH(s1.substring(1, 3));
                int k = Common.cH(s1.substring(3, 5));
                int l = Common.cH(s1.substring(5, 7));
                String s2 = s1.substring(1, 7);
                String s3 = (new StringBuilder(String.valueOf(s))).append("<TD align=center width=25%>").append("\t<table width=100 height=50 id=tb1 bgcolor='#").append(s2).append("'  cellspacing=0 cellpadding=0 border=1 bordercolor=#545C57 >").append("\t<tr><td width=100 height=50> ").append("\t</td></tr>").append("\t</table>").append("\t<br>").append("\t<font color=white>").append("\tR : <input type='number' size=5 id=inR value='").append(j).append("' onkeyup='over3(this)' onblur='over5(this)' maxlength=3 style=text-align:center><br>").append("\tG : <input type='number' size=5 id=inG value='").append(k).append("' onkeyup='over3(this)' onblur='over5(this)' maxlength=3 style=text-align:center><br>").append("\tB : <input type='number' size=5 id=inB value='").append(l).append("' onkeyup='over3(this)' onblur='over5(this)' maxlength=3 style=text-align:center>").append("\t</font>").append("</TD>").append("<TD align=center width=25%>").append("\t\t\t\t<table width='100%' height='100%' border=1 cellspacing=0 cellpadding=0 bgcolor=#545C57 valign=center>").append("\t\t\t\t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FFFFFF' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#000000' onclick=over(this)>&nbsp;</td>  \t").append("   \t\t    \t\t</tr>").append("\t\t\t\t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FF0000' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FF3000' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t</tr>").append("   \t\t    \t\t<tr>").append("\t\t\t\t\t\t<td width='10%' bgcolor='#FF7200' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FFC000' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FFFF00' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#74FF00' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#30FF00' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#00FF30' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#00FF66' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#00A9FF' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#0060FF' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#0000FF' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#7400FF' onclick=over(this)>&nbsp;</td>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#4D00FF' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t\t\t\t\t\t\t</tr>").append("   \t\t    \t\t<tr>").append("   \t\t    \t\t\t<td width='10%' bgcolor='#FF00FF' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t<td width='10%' bgcolor='#FF0090' onclick=over(this)>&nbsp;</td>").append("\t\t\t\t\t\t\t\t\t\t\t\t</tr>").append("   \t\t    \t\t").append("   \t\t    \t\t</table>").append("\t</TD>").append("</TR>").append("</TABLE>").append("<br>").append("<div id=divDown></div>").append("<br>").append("<center>").append("<input type=button class=myButton value='").append(Color.mThis.getResources().getString(0x7f060023)).append("' onclick=onCancel() >").append("&nbsp;&nbsp;&nbsp;&nbsp;<input type=button  class=myButton value='").append(Color.mThis.getResources().getString(0x7f060024)).append("'  onclick=onchFontColor()>").append("</center>").append("</body>").append("</html>").append("<script> ").append("clr=new Array('00','11','22','33','44','55','66','77','88','99','aa','bb','cc','dd','ee','ff'); ").append("downStr='';").append("downStr+=('<table border=1 bordercolor=#545C57   cellspacing=0 cellpadding=0 width=100%><tr><td><table width=100% border=0 cellpadding=0 cellspacing=0 >'); ").append("downStr+=('<tr height=50>'); ").append("var red=15; ").append("var green=0; ").append("var blue=0; ").append("for (green=0;green<16;green++) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("green=15; ").append("blue=0; ").append("red=15; ").append("for (red=15;red>-1;red--) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("green=15; ").append("blue=0; ").append("red=0; ").append("for (blue=0;blue<16;blue++) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("green=15; ").append("blue=15; ").append("red=0; ").append("for (green=15;green>-1;green--) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("green=0; ").append("blue=15; ").append("red=0; ").append("for (red=0;red<16;red++) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("green=0; ").append("blue=15; ").append("red=15; ").append("for (blue=15;blue>-1;blue--) { ").append("downStr+=('<td width=1% bgcolor=#'+clr[red]+clr[green]+clr[blue]+' onMousedown=over(this)></td>'); ").append("} ").append("downStr+=('</tr>'); ").append("downStr+=('</table></td></tr></table>'); ").append("divDown.innerHTML = downStr;").append("</script>").append("<script>").append("var sR =255;").append("var sG=0;").append("var sB =0;").append("max= 'r';").append("mid = 'g';").append("min = 'b';").append("sMax = sR ;").append("sMid = sG ;").append("sMin =sB ;").append("function bbb()").append("{").append("\tif(sR==255) ").append("\t{").append("\t\tmax= 'r';").append("\t\tsMax = sR ;").append("\t\tif(sG < sB)").append("\t\t{").append("\t\t\tmin = 'g';").append("\t\t\tsMin=sG;").append("\t\t\tmid = 'b';").append("\t\t\tsMid =sB;").append("\t\t}else{").append("\t\t\tmin = 'b';").append("\t\t\tsMin=sB;").append("\t\t\tmid = 'g';").append("\t\t\tsMid =sG;").append("\t\t}").append("\t}").append("\telse if(sG==255)").append("\t{").append("\t\tmax= 'g';").append("\t\tsMax = sG ;").append("\t\tif(sR < sB)").append("\t\t{").append("\t\t\tmin = 'r';").append("\t\t\tsMin=sR;").append("\t\t\tmid = 'b';").append("\t\t\tsMid =sB;").append("\t\t}else{").append("\t\t\tmin = 'b';").append("\t\t\tsMin=sB;").append("\t\t\tmid = 'r';").append("\t\t\tsMid =sR;").append("\t\t}").append("\t}").append("\telse if(sB==255)").append("\t{").append("\t\tmax= 'b';").append("\t\tsMax = sB ;").append("\t\t").append("\t\tif(sR < sG)").append("\t\t{").append("\t\t\tmin = 'r';").append("\t\t\tsMin=sR;").append("\t\t\tmid = 'g';").append("\t\t\tsMid =sG;").append("\t\t}else{").append("\t\t\tmin = 'g';").append("\t\t\tsMin=sG;").append("\t\t\tmid = 'r';").append("\t\t\tsMid =sR;").append("\t\t}").append("\t}").append("\t").append("\taMax =255;").append("\taMin =255;").append("\taMid =255;").append("\tBriStr ='';").append("\tBriStr+=('<table border=1 bordercolor=#545C57   cellspacing=0 cellpadding=0 ><tr><td><table width=50 cellspacing=0 cellpadding=0 border=0 >');").append("\tsumb =0;").append("\tsump =0;").append("\tvar x =3;").append("\t").append("\tBriStr+=('<tr >');").append("\tBriStr+=('<td width=100% height=30 bgcolor=#ffffff onclick=over2(this) >');").append("\tBriStr+=('</td>');").append("\tBriStr+=('</tr>'); ").append("\t").append("\tfor( i =0; i < 512 ; i = i+x)").append("\t{").append("\t\tif(max =='r'\t) rr = aMax.toString(16);").append("\t\tif(max =='g') gg = aMax.toString(16);").append("\t\tif(max =='b') bb = aMax.toString(16);").append("\t\tif(mid =='r'\t) rr = aMid.toString(16);").append("\t\tif(mid =='g') gg = aMid.toString(16);").append("\t\tif(mid =='b') bb = aMid.toString(16);").append("\t\tif(min =='r'\t) rr = aMin.toString(16);").append("\t\tif(min =='g') gg = aMin.toString(16);").append("\t\tif(min =='b') bb = aMin.toString(16);").append("\t\tif(rr.length <2)  rr ='0'+rr;").append("\t\tif(gg.length <2)  gg ='0'+gg;").append("\t\tif(bb.length <2)  bb ='0'+bb;").append("\t\tBriStr+=('<tr height=1>');").append("\t\tBriStr+=('<td width=100% height=1 bgcolor=#'+rr +''+gg+''+bb+' onclick=over2(this) >');").append("\t\tBriStr+=('</td>');").append("\t\tBriStr+=('</tr>'); ").append("\t\t").append("\t\tif(sR == sG && sG==sB)").append("\t\t{").append("\t\t\tsumb = sumb+  1/2*x;").append("\t\t\taMax =255- parseInt(sumb);").append("\t\t\taMin =255- parseInt(sumb);").append("\t\t\taMid =255- parseInt(sumb);").append("\t\t}else{").append("\t\t\tif(i <= 255)").append("\t\t\t{").append("\t\t\t\taMax = 255;").append("\t\t\t\taMin = aMin -x ;").append("\t\t\t\tsumb = sumb+ (255-sMid)/255 *x;").append("\t\t\t\taMid =255- parseInt(sumb);").append("\t\t\t}").append("\t\t\tif(i >= 254 )").append("\t\t\t{").append("\t\t\t\taMax =aMax -x;").append("\t\t\t\taMin =0;").append("\t\t\t\tsump = sump + (sMid/255) *x ;").append("\t\t\t\taMid = sMid- parseInt(sump);").append("\t\t\t}").append("\t\t}").append("\t}").append("\t").append("\tBriStr+=('<tr height=30>');").append("\tBriStr+=('<td width=100% height=30 bgcolor=#000000 onclick=over2(this) >');").append("\tBriStr+=('</td>');").append("\tBriStr+=('</tr>'); ").append("\t").append("\t").append("\tBriStr+=('</table></td></tr></table>');").append("\tdivBir.innerHTML=BriStr;").append("}").append("function over(o)").append("{").append("\tbg = o.bgColor.replace('#','');").append("\tsR = parseInt('0x'+bg.substring(0,2)).toString(10);").append("\tsG= parseInt('0x'+bg.substring(2,4)).toString(10);").append("\tsB = parseInt('0x'+bg.substring(4,6)).toString(10);").append("\ttb1.bgColor=bg; ").append("\t").append("\tinR.value=sR;").append("\tinG.value=sG;").append("\tinB.value=sB;").append("\t").append("\tbbb();").append("}").append("function over2(o)").append("{").append("\tbg = o.bgColor.replace('#','');").append("\tsR = parseInt('0x'+bg.substring(0,2)).toString(10);").append("\tsG= parseInt('0x'+bg.substring(2,4)).toString(10);").append("\tsB = parseInt('0x'+bg.substring(4,6)).toString(10);").append("\tinR.value=sR;").append("\tinG.value=sG;").append("\tinB.value=sB;").append("\ttb1.bgColor=bg; ").append("}").append("function over3(o)").append("{\t").append("\tr =  inR.value;").append("\tg =  inG.value;").append("\tb =  inB.value;").append("\tif(r=='') r=0;").append("\tif(g=='') g=0;").append("\tif(b=='') b=0;").append("\tr=parseInt(r);").append("\tg=parseInt(g);").append("\tb=parseInt(b);").append("\tif(r> 255) r=255;").append("\tif(g>255) g=255;").append("\tif(b>255) b=255;").append("\ttb1.bgColor= '#'+r.toString(16) +g.toString(16)+b.toString(16); \t").append("}").append("function over5(o)").append("{").append("\toV = o.value;").append("\tif(oV =='') oV ='0'; ").append("\toV = parseInt (oV);").append("\tif(oV> 255) oV=255;").append("\to.value = oV;").append("\tover3(o);").append("}").append(" bbb();").append("function onchFontColor()").append("{").append("\twindow.android.setColor(tb1.bgColor);").append("}").append("function onCancel()").append("{").append("\twindow.android.setCancel();").append("}").append("</script>").toString();
                return (new StringBuilder()).append(stringbuilder).append(s3).toString();
            }
            stringbuilder.append("                                            ");
            stringbuilder.append("                                            ");
            i++;
        } while (true);
    }
}