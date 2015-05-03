package events;

public class Controller {
	private EventSet es = new EventSet();

	public void addEvent(Event c) {
		es.add(c);
	}

	public void run() {
		Event e;
		int priority = 0;
		while ((e = es.getNext()) != null) {
			if (e.getPriority() == priority) {
				e.action();
				System.out.println(e.description());
				es.removeCurrent();
			}
			if (es.looped())
				priority++;
		}
	}
}
