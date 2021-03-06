package controller;

import model.Model;

/**
 * Абстрактный контроллер
 *
 * @param <O> операции
 * @param <M> модель
 * @param <P> свойство модели
 * @author Andrey Semenyuk
 */
public interface IController<O, M extends Model<P>, P> {
	/**
	 * Выполнить
	 *
	 * @param operation операция
	 * @param model     модель
	 * @param attribute атрибут операции
	 */
	void execute(O operation, M model, P attribute);
}
