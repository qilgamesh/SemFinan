package model;

/**
 * Подписчик модели
 *
 * @param <P> свойство модели
 * @author Andrey Semenyuk
 */
public interface IModelSubscriber<P> {
	/**
	 * Событие изменения модели
	 *
	 * @param model модель
	 */
	void modelChanged(Model<P> model);
}
