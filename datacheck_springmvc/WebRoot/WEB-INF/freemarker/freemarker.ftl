==Hello,Welcome to Use FreeMarker .==
<br/>
1. assign 
<br/>
assign指令在前面已经使用了多次,它用于为该模板页面创建或替换一个顶层变量,
assign指令的用法有多种,包含创建或替换一个顶层变量,或者创建或替换多个变量等。
<br/>
示范代码：
<#assign x>
<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n>
${n}
</#list>
</#assign>
<br/>
${x}
<br/>
2. break 
${r'<#break>指令用于跳出迭代'?html}
...
