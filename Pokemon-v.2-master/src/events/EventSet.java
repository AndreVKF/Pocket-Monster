package events;

class EventSet {
	private Event[] events = new Event[100];
	private int index = 0;
	private int next = 0;
	private boolean looped;

	public void add(Event e) {
		if (index >= events.length)
			return; // (In real life, throw exception)
		events[index++] = e;
	}

	public Event getNext() {
		looped = false;
		int start = next;
		do {
			next = (next + 1) % events.length;
			// See if it has looped to the beginning:
			if (start == next)
				looped = true;
			// If it loops past start, the list
			// is empty:
			if ((next == (start + 1) % events.length) && looped)
				return null;
		} while (events[next] == null);
		return events[next];
	}
	
	public boolean looped() {
		return this.looped;
	}

	public void removeCurrent() {
		events[next] = null;
	}
}
