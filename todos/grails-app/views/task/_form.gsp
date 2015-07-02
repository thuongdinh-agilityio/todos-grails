<%@ page import="com.todos.Task" %>



<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="task.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${taskInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="task.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="5000" required="" value="${taskInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'startDate', 'error')} required">
	<label for="startDate">
		<g:message code="task.startDate.label" default="Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startDate" precision="day"  value="${taskInstance?.startDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="task.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${taskInstance?.endDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'isDone', 'error')} ">
	<label for="isDone">
		<g:message code="task.isDone.label" default="Is Done" />
		
	</label>
	<g:checkBox name="isDone" value="${taskInstance?.isDone}" />

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'contributes', 'error')} ">
	<label for="contributes">
		<g:message code="task.contributes.label" default="Contributes" />
		
	</label>
	<g:select name="contributes" from="${com.todos.User.list()}" multiple="multiple" optionKey="id" size="5" value="${taskInstance?.contributes*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="task.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.todos.User.list()}" optionKey="id" required="" value="${taskInstance?.user?.id}" class="many-to-one"/>

</div>

