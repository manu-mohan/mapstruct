package com.manumohan.bfs.mapstruct.model;

import java.util.Objects;

public class PersonDetails implements Cloneable
{
	private String firstName;
	private String lastName;
	private String title;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}

		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		PersonDetails that = (PersonDetails) o;
		return Objects.equals(firstName, that.firstName);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(firstName);
	}

	@Override
	public PersonDetails clone() throws CloneNotSupportedException
	{
		PersonDetails personDetails = new PersonDetails();

		personDetails.setTitle(this.title);
		personDetails.setFirstName(this.firstName);
		personDetails.setLastName(this.lastName);

		return personDetails;
	}

	@Override
	public String toString()
	{
		return "PersonDetails{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", title='" + title + '\'' +
			'}';
	}
}
