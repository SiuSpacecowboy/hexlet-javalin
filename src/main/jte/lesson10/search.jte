@import exercise.lesson10.PersonsPage
@param PersonsPage persons


<form action="/users" method="get">
    <input type="search" name="term" value="${persons.getTerm()}">
    <input type="submit" name="Search">
</form>

@if(!persons.getPersons().isEmpty())
    @for(var person : persons.getPersons())
        <div>
            <h3><p>${person.name()} ${person.secondName()}</p></h3>
        </div>
    @endfor
@endif

