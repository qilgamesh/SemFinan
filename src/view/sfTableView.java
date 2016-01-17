package view;

import controller.Controller;
import controller.sfTableController;
import model.Model;
import model.sfTableModel;

import java.util.Collection;

/**
 * Представление таблицы
 *
 * @param <P> свойство модели
 * @author Andrey Semenyuk
 */
public abstract class sfTableView<P> extends BaseView<sfTableModel<P>, Collection<Model<P>>> {
	private final Controller<P> controller = new Controller<P>();

	private final sfTableController<P> tableController = new sfTableController<>();

	/**
	 * Редактировать модель
	 *
	 * @param model    модель
	 * @param property свойство модели
	 */
	protected void edit(Model<P> model, P property) {
		controller.execute(Controller.O.EDIT, model, property);
	}

	/**
	 * Добавить модель
	 *
	 * @param model модель
	 */
	protected void add(Model<P> model) {
		tableController.execute(sfTableController.O.ADD, getModel(), model);
	}

	/**
	 * Удалить модель
	 *
	 * @param model модель
	 */
	protected void delete(Model<P> model) {
		tableController.execute(sfTableController.O.REMOVE, getModel(), model);
	}
}