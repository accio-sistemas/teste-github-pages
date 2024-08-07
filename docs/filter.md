# Opções de filtros

## Filtros padrão gerados nos CRUDS

```xml
<table>
	<filter>
			<ID_USER contains="" order="Asc"/>
			<PASSWORD contains="" order=""/>
			<ID_ENTERPRISE min="" max="" order=""/>
			<NAME contains="" order=""/>
			<EMAIL contains="" order=""/>
			<FONE contains="" order=""/>
			<STATUS contains="" order=""/>
			<ACTIVE_USER value="" order=""/>
			<INITIALS contains="" order=""/>
			<EXPIRED_PASS value="" order=""/>
			<DAYS_TO_EXP min="" max="" order=""/>
			<EXPIRY_DATE min="" max="" order=""/>
			<LAST_UPDATE min="" max="" order=""/>

	</filter>
	<list RecordsPerPage="0" Page="0" Pages="0"/>
	<result success="">
		<error.msg/>
	</result>
</table>
```

## Outras opções para Strings

### like, begins, ends, unlike, value, not.value, not.in 

```xml
<table>
	<filter>
			<NAME unlike="system" order=""/>
			<EMAIL like="%@accio.net.br" order=""/>
			<FONE begins="11" order=""/>
			<ACTIVE_USER value="true" order=""/>
			<INITIALS ends="FF" order=""/>
			<EXPIRED_PASS not.value="false" order=""/>

	</filter>
	<list RecordsPerPage="0" Page="0" Pages="0"/>
	<result success="">
		<error.msg/>
	</result>
</table>
```

## Outras opções para int e date

### null, in, min, max 


```xml
<table>
	<filter>
			<ID_ENTERPRISE min="1" max="10" order=""/>
			<NAME null="true" order=""/>
			<EMAIL null="false" order=""/>
			<DAYS_TO_EXP in="1 2 3" order=""/>
			<EXPIRY_DATE min="2015-01-01" max="2016-01-01" order=""/>
			<LAST_UPDATE min="2015-01-01T00:00:00" max="2015-01-01T12:00:00" order=""/>

	</filter>
	<list RecordsPerPage="0" Page="0" Pages="0"/>
	<result success="">
		<error.msg/>
	</result>
</table>
```

## Paginação

### Trazer até 500 registros

```xml
	<list RecordsPerPage="500" Page="0" Pages="0"/>
</table>
```

### Trazer 12 registros da página 3

```xml
	<list RecordsPerPage="12" Page="3" Pages="0"/>
</table>
```
