package com.heart.tower.util;

import android.text.Html;

import com.heart.tower.R;
import com.heart.tower.entities.ArticlesItem;
import com.heart.tower.entities.SearchItem;

import java.util.ArrayList;
import java.util.List;

public class AppData {

    public List<SearchItem> searchList = new ArrayList<>();
    public List<ArticlesItem> articleList = new ArrayList<>();

    public AppData() {

        articleList.add(new ArticlesItem(
                R.drawable.article1,
                "В чем преимущество интернет-знакомств!",
                Html.fromHtml(" Когда люди впервые слышат про интернет-знакомства, у них сразу появляется масса вопросов: правда ли это, реально ли в самом деле встретить здесь \"своего\" человека и как вообще эти знакомства происходят?\n" +
                        "\n" +
                        "На сегодняшний дней в интернете столько сайтов знакомств, что разбегаются глаза (обзоры самых интересных и полностью бесплатных сайтов Вы найдёте на нашем сайте), поэтому процесс знакомства не представляет из себя ничего сложного. Хочу заметить, что немало людей на этих сайтах ищут именно серьёзные отношения. Другие же просто общаются и развлекаются.\n" +
                        "\n" +
                        "Люди думают, что знакомства в интернете имеют виртуальную сторону. Но скажите, разве Вам кто-то мешает в будущем перенести их в реальную жизнь!\n" +
                        "\n" +
                        "Поговорим о достоинствах сайтов знакомств в интернете. Во-первых, это бесплатно. Во-вторых, это Ваша защищенность и если хотите анонимность. Ведь всё общение происходит с помощью внутренней личной переписки и Вам даже не обязательно оставлять телефон. В-третьих, пользоваться услугами сайтов знакомств могут как мужчины, так и женщины, в этом нет ничего зазорного. В-четвертых, здесь Вы сначала можете получше узнать партнера в процессе переписки, а затем уже решить - стоит ли переходить на новый шаг в общении или нет. В-пятых, здесь можно найти новых друзей.\n" +
                        "\n" +
                        "Поэтому можно смело утверждать, что знакомства в сети - это просто, бесплатно и интересно, а главное - действенно."),
                Html.fromHtml(
                        "Когда люди впервые слышат про интернет-знакомства, у них сразу появляется масса вопросов: правда ли это, реально ли в самом деле встретить здесь \"своего\" человека и как вообще эти знакомства происходят?")
        ));



        articleList.add(new ArticlesItem(
                R.drawable.article2,
                "What is the advantage of online dating?",
                Html.fromHtml("When people first hear about online dating, they immediately have a lot of questions: is this true, is it really possible to meet “your” person here, and how do these acquaintances generally happen?\n" +
                        "\n" +
                        "Today, there are so many dating sites on the Internet that you can run your eyes (you will find reviews of the most interesting and completely free sites on our site), so the dating process is not complicated. I want to note that quite a few people on these sites are looking for a serious relationship. Others just talk and have fun.\n" +
                        "\n" +
                        "People think that dating on the Internet has a virtual side. But tell me, does someone bother you in the future to transfer them to real life!\n" +
                        "\n" +
                        "Let's talk about the merits of dating sites on the Internet. First off, it's free. Secondly, it is your security and if you want anonymity. After all, all communication takes place with the help of internal personal correspondence and you do not even have to leave your phone. Thirdly, both men and women can use the services of dating sites, there is nothing wrong with that. Fourth, here you can first get to know your partner better in the process of correspondence, and then decide whether to go to the next step in communication or not. Fifth, here you can find new friends.\n" +
                        "\n" +
                        "Therefore, we can safely say that online dating is simple, free and interesting, and most importantly - effective."),
                Html.fromHtml("When people first hear about online dating, they immediately have a lot of questions: is this true, is it really possible to meet “your” person here, and how do these acquaintances generally happen?")
        ));

        articleList.add(new ArticlesItem(
                R.drawable.article3,
                "Was ist der Vorteil von Online-Dating?",
                Html.fromHtml("Wenn Menschen zum ersten Mal von Online-Dating hören, haben sie sofort viele Fragen: Stimmt das, ist es wirklich möglich, „Ihre“ Person hier zu treffen, und wie kommen diese Bekanntschaften im Allgemeinen vor?\n" +
                        "\n" +
                        "Heutzutage gibt es im Internet so viele Dating-Sites, dass Sie Ihre Augen schweifen lassen können (Sie finden Bewertungen der interessantesten und völlig kostenlosen Sites auf unserer Site), sodass der Dating-Prozess nicht kompliziert ist. Ich möchte darauf hinweisen, dass einige Leute auf diesen Websites nach einer ernsthaften Beziehung suchen. Andere reden einfach und haben Spaß.\n" +
                        "\n" +
                        "Die Leute denken, dass Dating im Internet eine virtuelle Seite hat. Aber sag mir, stört dich in Zukunft jemand, sie in das wirkliche Leben zu übertragen?\n" +
                        "\n" +
                        "Lassen Sie uns über die Vorzüge von Dating-Sites im Internet sprechen. Zunächst einmal ist es kostenlos. Zweitens ist es Ihre Sicherheit und wenn Sie Anonymität wollen. Schließlich erfolgt die gesamte Kommunikation mithilfe der internen persönlichen Korrespondenz, und Sie müssen nicht einmal Ihr Telefon verlassen. Drittens können sowohl Männer als auch Frauen die Dienste von Dating-Sites nutzen, daran ist nichts auszusetzen. Viertens können Sie hier zuerst Ihren Partner im Korrespondenzprozess besser kennenlernen und dann entscheiden, ob Sie mit dem nächsten Kommunikationsschritt fortfahren möchten oder nicht. Fünftens finden Sie hier neue Freunde.\n" +
                        "\n" +
                        "Daher können wir mit Sicherheit sagen, dass Online-Dating einfach, kostenlos und interessant und vor allem effektiv ist."),
                Html.fromHtml("Wenn Menschen zum ersten Mal von Online-Dating hören, haben sie sofort viele Fragen: Stimmt das, ist es wirklich möglich, „Ihre“ Person hier zu treffen, und wie kommen diese Bekanntschaften im Allgemeinen vor?")
        ));

        articleList.add(new ArticlesItem(
                R.drawable.article4,
                "Qual è il vantaggio degli appuntamenti online?",
                Html.fromHtml("Quando le persone sentono parlare per la prima volta di appuntamenti online, hanno immediatamente molte domande: è vero, è davvero possibile incontrare la \"tua\" persona qui, e come si verificano generalmente questi conoscenti?\n" +
                        "\n" +
                        "Oggi, ci sono così tanti siti di incontri su Internet che puoi farti vedere (troverai recensioni dei siti più interessanti e completamente gratuiti sul nostro sito), quindi il processo di incontri non è complicato. Voglio notare che molte persone su questi siti sono alla ricerca di una relazione seria. Altri parlano e si divertono.\n" +
                        "\n" +
                        "La gente pensa che gli appuntamenti su Internet abbiano un lato virtuale. Ma dimmi, qualcuno ti disturba in futuro per trasferirli nella vita reale!\n" +
                        "\n" +
                        "Parliamo dei meriti dei siti di incontri su Internet. Prima di tutto, è gratuito. In secondo luogo, è la tua sicurezza e se vuoi l'anonimato. Dopotutto, tutte le comunicazioni avvengono con l'aiuto della corrispondenza personale interna e non è nemmeno necessario lasciare il telefono. In terzo luogo, sia gli uomini che le donne possono utilizzare i servizi di siti di incontri, non c'è nulla di sbagliato in questo. In quarto luogo, qui puoi prima conoscere meglio il tuo partner nel processo di corrispondenza e quindi decidere se andare al passaggio successivo nella comunicazione o meno. In quinto luogo, qui puoi trovare nuovi amici.\n" +
                        "\n" +
                        "Pertanto, possiamo tranquillamente affermare che gli appuntamenti online sono semplici, gratuiti e interessanti e, soprattutto, efficaci."
                ),
                Html.fromHtml("Quando le persone sentono parlare per la prima volta di appuntamenti online, hanno immediatamente molte domande: è vero, è davvero possibile incontrare la \"tua\" persona qui, e come si verificano generalmente questi conoscenti?")));

        articleList.add(new ArticlesItem(
                R.drawable.article4,
                "¿Cuál es la ventaja de las citas en línea?",
                Html.fromHtml("Cuando las personas escuchan por primera vez acerca de las citas en línea, inmediatamente tienen muchas preguntas: ¿es esto cierto? ¿Es realmente posible conocer a \"su\" persona aquí y cómo ocurren generalmente estos conocidos?\n" +
                        "\n" +
                        "Hoy en día, hay tantos sitios de citas en Internet que puede pasar desapercibido (encontrará reseñas de los sitios más interesantes y completamente gratuitos en nuestro sitio), por lo que el proceso de citas no es complicado. Quiero señalar que algunas personas en estos sitios están buscando una relación seria. Otros solo hablan y se divierten.\n" +
                        "\n" +
                        "La gente piensa que las citas en Internet tienen un lado virtual. Pero dime, ¿alguien te molesta en el futuro para transferirlos a la vida real?\n" +
                        "\n" +
                        "Hablemos de los méritos de los sitios de citas en Internet. En primer lugar, es gratis. En segundo lugar, es su seguridad y si desea el anonimato. Después de todo, toda la comunicación se lleva a cabo con la ayuda de correspondencia personal interna y ni siquiera tiene que dejar su teléfono. En tercer lugar, tanto hombres como mujeres pueden usar los servicios de sitios de citas, no hay nada de malo en eso. Cuarto, aquí puede primero conocer mejor a su pareja en el proceso de correspondencia y luego decidir si va al siguiente paso en la comunicación o no. Quinto, aquí puedes encontrar nuevos amigos.\n" +
                        "\n" +
                        "Por lo tanto, podemos decir con seguridad que las citas en línea son simples, gratuitas e interesantes, y lo más importante, efectivas."
                ),
                Html.fromHtml("Cuando las personas escuchan por primera vez acerca de las citas en línea, inmediatamente tienen muchas preguntas: ¿es esto cierto? ¿Es realmente posible conocer a \"su\" persona aquí y cómo ocurren generalmente estos conocidos?")));



        searchList.add(new SearchItem(
                R.drawable.f1,
                "Анна",
                "Россия, Санкт-Петербург",
                45,
                "Не курящего, без пуза и усов ",
                "с парнем в возрасте 31 - 45 лет",
                "дружба, общение, флирт, встреча, свидание",
                "155 см",
                "60 кг",
                "полное",
                "европейская",
                "ученая степень",
                "Русский (Russian)",
                "гетеро",
                "не курю",
                "пью в компаниях изредка",
                "03.04.20",
                "Рак",
                "Не курящего, без пуза и усов",
                "стабильный средний доход",
                "отдельная квартира (снимаю или своя)",
                "нет"
        ));

        searchList.add(new SearchItem(
                R.drawable.f2,
                "Миссис Твиссис",
                "Россия, Ярославль",
                29,
                "Ищу мужчину, который запретит..., обоснует..., убедит. .. и я буду слушаться. ",
                "с парнем в возрасте 30 - 50 лет",
                "дружба, общение, отношения",
                "175 см",
                "59 кг",
                "обычное",
                "европейская",
                "высшее",
                "Русский (Russian)",
                "гетеро",
                "не курю",
                "пью в компаниях изредка",
                "03.04.20",
                "Овен",
                "Ищу мужчину, который запретит..., обоснует..., убедит. .. и я буду слушаться. ",
                "нет работы",
                "отдельная квартира (снимаю или своя)",
                "нет"
        ));

        searchList.add(new SearchItem(
                R.drawable.f3,
                "Татьяна",
                "Россия, Сочи",
                34,
                "Хочу любви, большой и чистой, маленькую и грязную оставьте при себе... Познакомимся??",
                "с парнем в возрасте 33 - 45 лет",
                "брак, создание семьи",
                "175 см",
                "62 кг",
                "обычное",
                "европейская",
                "два или более высших",
                "Русский (Russian)",
                "гетеро",
                "не курю",
                "не пью вообще",
                "24.03.20",
                "Лев",
                "Хочу любви, большой и чистой, маленькую и грязную оставьте при себе... Познакомимся??",
                "постоянный небольшой доход",
                "отдельная квартира (снимаю или своя)",
                "живу с родителями"

        ));

        searchList.add(new SearchItem(
                R.drawable.f4,
                "Beра",
                "Россия, Рим",
                30,
                "Люблю путешествовать! Ищу умную, красивую и сексуальную девушку для отношений.",
                "с девушкой в возрасте 18 - 44 года",
                "дружба, общение, отношения, брак, создание семьи, флирт",
                "178 см",
                "57 кг",
                "--",
                "--",
                "--",
                "Russian (Russian)",
                "би",
                "бросаю",
                "--",
                "03.24.20",
                "Рим",
                "Люблю путешествовать! Ищу умную, красивую и сексуальную девушку для отношений.",
                "--",
                "--",
                "--"
        ));

        searchList.add(new SearchItem(
                R.drawable.f5,
                "Венера",
                "Испания, Барселона",
                25,
                "for a man",
                "с парнем в возрасте 34 - 80 лет",
                "дружба, общение, брак, создание семьи",
                "170 см",
                "97 кг",
                "полное",
                "европейская",
                "среднее специальное",
                "Russian (Russian)",
                "гетеро",
                "не курю",
                "пью в компаниях изредка",
                "04.04.20",
                "Рак",
                "Хочу найти адекватного мужчину. )Меня не интересуют разовые встречи. Мне нужен мужчина для жизни. ",
                "--",
                "отдельная квартира (снимаю или своя)",
                "есть, живём вместе"
        ));
        searchList.add(new SearchItem(
                R.drawable.f6,
                "Lady",
                "Германия, Берлин",
                24,
                "--",
                "с парнем в возрасте 28 - 50 лет",
                "дружба, общение, флирт, путешествия, встреча, свидание",
                "161 см",
                "45 кг",
                "спортивное",
                "европейская",
                "высшее",
                " Русский (Russian)",
                "гетеро",
                "не курю",
                "не пью вообще",
                "04.04.20",
                "Рыбы",
                "Качественно выношу мозг :)",
                "--",
                "отдельная квартира (снимаю или своя)",
                "нет"
        ));

        searchList.add(new SearchItem(
                R.drawable.f7,
                "Katty",
                "Германия, Берлин",
                22,
                "--",
                "с парнем или с девушкой в возрасте 20 - 50 лет",
                "встреча, свидание",
                "175 см",
                "79 кг",
                "плотное",
                "европейская",
                "высшее",
                "Русский (Russian)",
                "гетеро",
                "не курю",
                "не пью вообще",
                "25.03.20",
                "Водолей",
                "Пишите :) Буду рада общению :) Когда еще? :)",
                "нет работы",
                "живу с приятелем или с подругой",
                "нет"
        ));

        searchList.add(new SearchItem(
                R.drawable.f8,
                "Лола",
                "Германия, Берлин",
                25,
                "--",
                "с парнем в возрасте 30 - 58 лет",
                "дружба, общение, переписка, флирт, встреча, свидание",
                "180 см",
                "71 кг",
                "--",
                "европейская",
                "--",
                "Русский (Russian)",
                "гетеро",
                "--",
                "--",
                "02.04.20",
                "Скорпион",
                "На фото я. Своё не верю оставляем при себе. Девушка с огоньком и изюминкой. ",
                "нет работы",
                "живу с приятелем или с подругой",
                "нет"
        ));
    }
}
