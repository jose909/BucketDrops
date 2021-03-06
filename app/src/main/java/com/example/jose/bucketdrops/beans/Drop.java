package com.example.jose.bucketdrops.beans;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by jose on 8/2/2016.
 */
public class Drop extends RealmObject {

	private  String what;

	public Drop(String what, long added, long when, boolean completed) {
		this.what = what;
		this.added = added;
		this.when = when;
		this.completed = completed;
	}

	@PrimaryKey
	private  long added;
	private long when;
	private boolean completed;

	public Drop() {
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public long getAdded() {
		return added;
	}

	public void setAdded(long added) {
		this.added = added;
	}

	public long getWhen() {
		return when;
	}

	public void setWhen(long when) {
		this.when = when;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
