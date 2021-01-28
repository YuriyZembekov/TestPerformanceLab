package daythree.tasktwo;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Object> {
    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key) {
            List<T> result = super.get(key);
            return result==null
                    ? Collections.<T>emptyList()
                    : result;
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Object object) {
        if (object instanceof MailMessage){
            // Получаем из MailMessage имя получателя
            String keyTo = ((MailMessage) object).getTo();

            // Проверяем наличие получателя в маилБокс
            // При отсутствии добавляем получателя и пустой список сообщений
            if (!mailBox.containsKey(keyTo)){
                mailBox.put(keyTo, new LinkedList<>());
            }
            // Получаем лист сообщений по ключу-получателю
            // и добавляем к нему ещё одно
            mailBox.get(keyTo).add((T) ((MailMessage) object).getContent());
        } else if(object instanceof Salary){
            // Получаем из Salary имя получателя
            String keyTo = ((Salary) object).getTo();

            // Проверяем наличие получателя в маилБокс
            // При отсутствии добавляем получателя и пустой список зарплат
            if (!mailBox.containsKey(keyTo)){
                mailBox.put(keyTo, new LinkedList<>());
            }
            mailBox.get(keyTo).add((T) ((Salary) object).getSalary());
        } else {
            throw new IllegalArgumentException("Неизвестный тип");
        }
    }

}
