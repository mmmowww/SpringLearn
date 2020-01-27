
package org.example.springcourse; // аналог NameSpace
import org.springframework.web.bind.annotation.*;  // Аналог USE (Общий вызов)
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController; //Нужен прямой вызов
 @RestController

public class PHP {
    public static class YIIframework {
        public String SQL; // Mysql команда для YII
        public String Answer; // Распарсенный ответ

        public void setSQL(String SQL) {
            this.SQL = SQL;
        }

        public double getSQL() {
            return this.SQL;
        }

        public void setAnswer(String Answer) {
            this.Answer = Answer;
        }

        public double getAnswer() {
            return this.Answer;
        }
        /// \|/ - Это что то вроде перегрузки (Класса, методов и т.д. я имею ввиду "@NameMethod","@NameClass")
        @RequestMapping(value = "/DBCommunication",
                method = RequestMethod.GET,
                produces = MediaType.APPLICATION_JSON_VALUE)
        // Пареметры с верху
        // 1 Дополнение к yii/site/'DBCommunication'
        // 2 Метод обращения
        // 3 Тип возращения информацыии (JSON)
        public void YIIframework(int id) {
            YIIframework result = new YIIframework();
            result.setSQL(id);
            result.setAnswer(id);
            result.getSQL();
            result.getAnswer();
            return result; // Возвращение результата, через самозацыкливание

        }
    }
}
