package controller;

import model.Model;

/**
 * @author Andrey Semenyuk
 */
public class Controller<P> implements IController<Controller.O, Model<P>, P> {
	/**
	 * Операции над моделью
	 */
	public enum O {
		/**
		 * Редактировать
		 */
		EDIT
	}

	public void execute(O operation, Model<P> model, P attribute) {
		if (operation == null)
			throw new NullPointerException("Пустой параметр operation");
		if (model == null)
			throw new NullPointerException("Пустой параметр model");
		if (attribute == null)
			throw new NullPointerException("Пустой параметр attribute");
		switch (operation) {
			case EDIT:
				model.setProperty(attribute);
				break;
			default:
				throw new IllegalArgumentException("Неизвестная операция: " +
						operation);
		}
	}
}
