package org.pentaho.di.ui.repository.repositoryexplorer.model;

import java.util.Set;

import org.pentaho.di.repository.IRole;
import org.pentaho.di.repository.UserInfo;
import org.pentaho.ui.xul.XulEventSourceAdapter;

public class UIRepositoryRole extends XulEventSourceAdapter implements IRole{

	private IRole rri;

	public UIRepositoryRole() {
	}

	public UIRepositoryRole(IRole rri) {
		this.rri = rri;
	}

	public String getName() {
		return rri.getName();
	}

	public void setName(String name) {
		rri.setName(name);
	}
	
	public String getDescription() {
		return rri.getDescription();
	}

	public void setDescription(String description) {
		rri.setDescription(description);
	}

	public void setUsers(Set<UserInfo> users) {
		rri.setUsers(users);
	}

	public Set<UserInfo> getUsers() {
		return rri.getUsers();
	}

	public boolean addUser(UserInfo user) {
		return rri.addUser(user);
	}

	public boolean removeUser(UserInfo user) {
		return rri.removeUser(user);
	}

	public void clearUsers() {
		rri.clearUsers();
	}

	public IRole getRole() {
		return rri;
	}
}
