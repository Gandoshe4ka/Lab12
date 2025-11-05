function showScreen(screenId) {
    document.querySelectorAll('.screen').forEach(screen => {
        screen.classList.remove('active');
    });
    document.getElementById(screenId).classList.add('active');
}

function setupAvatarUpload() {
    const avatarInput = document.getElementById('avatarInput');
    const avatarPreview = document.getElementById('avatarPreview');
    const mainAvatar = document.getElementById('mainAvatar');
    
    avatarInput.addEventListener('change', function(e) {
        const file = e.target.files[0];
        if (file) {
            const reader = new FileReader();
            reader.onload = function(e) {
                avatarPreview.style.backgroundImage = `url(${e.target.result})`;
                mainAvatar.style.backgroundImage = `url(${e.target.result})`;
            };
            reader.readAsDataURL(file);
        }
    });
}

function saveProfile() {
    const name = document.getElementById('userName').value || 'Пользователь';
    const status = document.getElementById('userStatus').value || 'Статус';
    
    document.getElementById('displayName').textContent = name;
    document.getElementById('displayStatus').textContent = status;
    
    showScreen('screen1');
}

const medicineQuestions1 = [
    {
        text: "Каким образом производятся наложение кровосостанавливающего жгута на поврежденную конечность?",
        options: [
            "Жгут накладывается на 10-15 см выше места повреждения, конечность фиксируется повязкой.",
            "Жгут накладывается на 10-15 см выше места повреждения на подкладочный материал.",
            "Жгут накладывается на 10-15 см выше места повреждения непосредственно на кожу.",
            "Жгут накладывается на 10-15 см ниже места повреждения на подкладочный материал.",
            "Жгут накладывается непосредственно на рану."
        ],
        correct: 1,
        image: "img/жгут.webp"
    },
    {
        text: "Как правильно обработать рану перед наложением повязки?",
        options: [
            "Промыть рану водой и обработать йодом",
            "Промыть рану перекисью водорода и наложить стерильную повязку",
            "Обработать рану спиртом и туго забинтовать",
            "Ничем не обрабатывать, сразу наложить повязку"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Что необходимо сделать при подозрении на перелом конечности?",
        options: [
            "Растянуть конечность для выпрямления",
            "Наложить тугую повязку",
            "Обеспечить неподвижность конечности с помощью шины",
            "Согреть конечность грелкой"
        ],
        correct: 2,
        image: null
    },
    {
        text: "Как определить наличие пульса у пострадавшего?",
        options: [
            "По пульсации на запястье",
            "По пульсации на шее",
            "По дыхательным движениям грудной клетки",
            "По цвету кожных покровов"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Что является признаком артериального кровотечения?",
        options: [
            "Медленное истечение темной крови",
            "Быстрое истечение алой крови пульсирующей струей",
            "Появление синяка на коже",
            "Небольшое выделение крови каплями"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Как правильно проводить искусственное дыхание?",
        options: [
            "Частое поверхностное дыхание в рот пострадавшего",
            "Глубокое дыхание в рот пострадавшего с частотой 10-12 раз в минуту",
            "Дыхание в нос пострадавшего с закрытым ртом",
            "Прерывистое дыхание с паузами"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Что делать при ожоге первой степени?",
        options: [
            "Наложить тугую повязку",
            "Охладить обожженный участок проточной водой",
            "Смазать маслом или жиром",
            "Прогреть обожженный участок"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Как правильно транспортировать пострадавшего с травмой позвоночника?",
        options: [
            "На мягких носилках в положении сидя",
            "На жестких носилках в положении лежа на животе",
            "На жестких носилках в положении лежа на спине",
            "Переносить на руках в удобном положении"
        ],
        correct: 2,
        image: null
    },
    {
        text: "Что является признаком шока у пострадавшего?",
        options: [
            "Повышенное артериальное давление и учащенный пульс",
            "Бледность кожи, холодный пот, слабый пульс",
            "Покраснение кожи и повышение температуры",
            "Учащенное глубокое дыхание"
        ],
        correct: 1,
        image: null
    },
    {
        text: "Как правильно наложить повязку на голову?",
        options: [
            "Круговыми движениями вокруг головы",
            "Восьмиобразной повязкой через затылок и подбородок",
            "Спиральной повязкой от лба к затылку",
            "Любым удобным способом"
        ],
        correct: 1,
        image: null
    }
];

const roadSignsQuestions = [
    {
        text: "Что означает этот дорожный знак?",
        options: [
            "Главная дорога",
            "Уступите дорогу",
            "Движение без остановки запрещено",
            "Пересечение равнозначных дорог"
        ],
        correct: 0,
        image: "img/ГД.jpg"
    },
    {
        text: "На каком расстоянии от знака 'Опасный поворот' следует снизить скорость?",
        options: [
            "Непосредственно перед поворотом",
            "За 100-150 метров до поворота",
            "За 50 метров до поворота",
            "Сразу после знака"
        ],
        correct: 1,
        image: "img/ОП.webp"
    },
    {
        text: "Что означает этот дорожный знак?",
        options: [
            "Стоянка запрещена",
            "Остановка запрещена",
            "Уступите дорогу",
            "Движение запрещено"
        ],
        correct: 2,
        image: "img/УД.jpg"
    },
    {
        text: "В каких случаях разрешена остановка под знаком 'Остановка запрещена'?",
        options: [
            "Для посадки пассажиров",
            "Для высадки пассажиров",
            "Для экстренной остановки",
            "Все перечисленные случаи"
        ],
        correct: 2,
        image: "img/СиОЗапрещена.webp"
    },
    {
        text: "Что означает этот дорожный знак?",
        options: [
            "Пересечение со второстепенной дорогой",
            "Пересечение равнозначных дорог",
            "Круговое движение",
            "Светофорное регулирование"
        ],
        correct: 1,
        image: "img/ПРД.jpg"
    },
    {
        text: "Какие меры следует принять при виде знака 'Скользкая дорога'?",
        options: [
            "Увеличить скорость",
            "Уменьшить скорость и быть готовым к заносу",
            "Резко затормозить",
            "Продолжать движение в прежнем режиме"
        ],
        correct: 1,
        image: "img/СД.webp"
    },
    {
        text: "Разрешено ли движение без остановки перед знаком 'Движение без остановки запрещено'?",
        options: [
            "Да, если нет помех",
            "Нет, всегда требуется остановка",
            "Только в ночное время",
            "Только для спецтранспорта"
        ],
        correct: 1,
        image: "img/СТОП.webp"
    },
    {
        text: "Что означает ограничение скорости 60 км/ч на знаке?",
        options: [
            "Рекомендуемая скорость",
            "Максимально разрешенная скорость",
            "Минимальная скорость",
            "Скорость в ночное время"
        ],
        correct: 1,
        image: "img/ОС60.png"
    },
    {
        text: "Разрешено ли поворачивать под знак 'Движение прямо'?",
        options: [
            "Да, в любом направлении",
            "Только направо",
            "Только налево",
            "Запрещены любые повороты"
        ],
        correct: 3,
        image: "img/ДП.webp"
    },
    {
        text: "Какие транспортные средства могут двигаться по автомагистрали?",
        options: [
            "Все транспортные средства",
            "Только автомобили с разрешенной скоростью более 40 км/ч",
            "Только грузовики",
            "Только легковые автомобили"
        ],
        correct: 1,
        image: "img/Автомагистраль.webp"
    }
];

let userProgress = {
    hours: 0,
    chapters: 0,
    tickets: 0,
    medicine: {
        ticket1: 0
    },
    signs: {
        ticket1: 0
    }
};

let currentTicketType = '';
let currentTicketNumber = 0;
let currentQuestions = [];
let currentQuestionIndex = 0;
let testResults = [];
let timerInterval;
let testStartTime;
let totalTestTime = 0;
let countdownInterval;
let testTimeSpent = 0;
let userAnswers = [];

// Слайдер - переменные
let touchStartX = 0;
let touchEndX = 0;
const SWIPE_THRESHOLD = 50;

function startTicket(ticketType, ticketNumber) {
    currentTicketType = ticketType;
    currentTicketNumber = ticketNumber;
    currentQuestionIndex = 0;
    testResults = [];
    userAnswers = new Array(10).fill(null);
    testStartTime = new Date();
    totalTestTime = 0;
    testTimeSpent = 0;
    
    if (ticketType === 'medicine') {
        currentQuestions = medicineQuestions1;
        document.getElementById('ticketName').textContent = 'Медицина - Билет 1';
    } else if (ticketType === 'signs') {
        currentQuestions = roadSignsQuestions;
        document.getElementById('ticketName').textContent = 'Дорожные знаки - Билет 1';
    }
    
    document.getElementById('backToTicketsBtn').onclick = function() {
        if (ticketType === 'medicine') {
            showScreen('screen4');
        } else if (ticketType === 'signs') {
            showScreen('screen8');
        }
    };
    
    startTimer(600);
    
    showScreen('screen5');
    loadQuestion();
    setupSwipeGestures();
}

function setupSwipeGestures() {
    const questionContent = document.querySelector('.question-content');
    
    questionContent.addEventListener('touchstart', e => {
        touchStartX = e.changedTouches[0].screenX;
    }, { passive: true });

    questionContent.addEventListener('touchend', e => {
        touchEndX = e.changedTouches[0].screenX;
        handleSwipe();
    }, { passive: true });

    // Для десктопных устройств - поддержка мыши
    questionContent.addEventListener('mousedown', e => {
        touchStartX = e.clientX;
        document.addEventListener('mouseup', handleMouseUp);
    });
}

function handleMouseUp(e) {
    touchEndX = e.clientX;
    handleSwipe();
    document.removeEventListener('mouseup', handleMouseUp);
}

function handleSwipe() {
    const diff = touchStartX - touchEndX;
    
    // Свайп влево - следующий вопрос
    if (diff > SWIPE_THRESHOLD) {
        nextQuestion();
    }
    // Свайп вправо - предыдущий вопрос (если не первый)
    else if (diff < -SWIPE_THRESHOLD && currentQuestionIndex > 0) {
        previousQuestion();
    }
}

function previousQuestion() {
    currentQuestionIndex--;
    loadQuestion();
}

function loadQuestion() {
    const question = currentQuestions[currentQuestionIndex];
    document.getElementById('questionText').textContent = question.text;
    document.getElementById('currentQuestion').textContent = currentQuestionIndex + 1;
    
    const questionImage = document.getElementById('questionImage');
    if (question.image) {
        questionImage.src = question.image;
        questionImage.style.display = 'block';
    } else {
        questionImage.style.display = 'none';
    }
    
    const optionsContainer = document.getElementById('optionsContainer');
    optionsContainer.innerHTML = '';
    
    question.options.forEach((option, index) => {
        const optionElement = document.createElement('div');
        optionElement.className = 'option';
        optionElement.textContent = option;
        optionElement.onclick = () => checkAnswer(index);
        optionsContainer.appendChild(optionElement);
    });
    
    document.getElementById('resultFeedback').style.display = 'none';
    document.getElementById('autoProgress').style.display = 'none';
    document.getElementById('nextButton').style.display = 'block';
    
    if (countdownInterval) {
        clearInterval(countdownInterval);
    }
}

function checkAnswer(selectedIndex) {
    const question = currentQuestions[currentQuestionIndex];
    const isCorrect = selectedIndex === question.correct;
    
    userAnswers[currentQuestionIndex] = selectedIndex;
    
    const options = document.querySelectorAll('.option');
    options.forEach(option => {
        option.onclick = null;
    });
    
    options[question.correct].classList.add('correct');
    
    if (!isCorrect) {
        options[selectedIndex].classList.add('incorrect');
    }
    
    const feedback = document.getElementById('resultFeedback');
    feedback.textContent = isCorrect ? "Правильно!" : "Неправильно!";
    feedback.className = isCorrect ? 'result-feedback result-correct' : 'result-feedback result-incorrect';
    feedback.style.display = 'block';
    
    document.getElementById('nextButton').style.display = 'none';
    
    let countdown = 1;
    document.getElementById('autoProgress').style.display = 'block';
    document.getElementById('countdown').textContent = countdown;
    
    countdownInterval = setInterval(() => {
        countdown--;
        document.getElementById('countdown').textContent = countdown;
        
        if (countdown <= 0) {
            clearInterval(countdownInterval);
            nextQuestion();
        }
    }, 1000);
}

function nextQuestion() {
    currentQuestionIndex++;
    
    if (currentQuestionIndex < currentQuestions.length) {
        loadQuestion();
    } else {
        finishTest();
    }
}

function finishTest() {
    clearInterval(timerInterval);
    if (countdownInterval) {
        clearInterval(countdownInterval);
    }
    
    testTimeSpent = 600 - timeLeft;
    totalTestTime += testTimeSpent;
    
    userProgress.hours += testTimeSpent / 3600;
    
    for (let i = 0; i < currentQuestions.length; i++) {
        const userAnswer = userAnswers[i];
        const correctAnswer = currentQuestions[i].correct;
        const isCorrect = userAnswer === correctAnswer;
        
        testResults.push({
            question: i + 1,
            userAnswer: userAnswer !== null ? userAnswer + 1 : 0,
            correctAnswer: correctAnswer + 1,
            isCorrect: isCorrect
        });
    }
    
    const correctCount = testResults.filter(r => r.isCorrect).length;
    const incorrectCount = testResults.length - correctCount;
    
    const percentage = Math.round((correctCount / currentQuestions.length) * 100);
    updateProgress(currentTicketType, currentTicketNumber, percentage);
    
    document.getElementById('correctCount').textContent = correctCount;
    document.getElementById('incorrectCount').textContent = incorrectCount;
    
    const minutes = Math.floor(testTimeSpent / 60);
    const seconds = testTimeSpent % 60;
    document.getElementById('totalTime').textContent = 
        `${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
    
    document.getElementById('hoursCount').textContent = userProgress.hours.toFixed(1) + 'ч';
    document.getElementById('chaptersCount').textContent = userProgress.chapters;
    document.getElementById('ticketsCount').textContent = userProgress.tickets;
    
    const resultsBody = document.getElementById('resultsBody');
    resultsBody.innerHTML = '';
    
    testResults.forEach(result => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${result.question}</td>
            <td>${result.userAnswer === 0 ? '—' : result.userAnswer}</td>
            <td>${result.correctAnswer}</td>
            <td class="${result.isCorrect ? 'correct' : 'incorrect'}">
                ${result.isCorrect ? '✓' : '✗'}
            </td>
        `;
        resultsBody.appendChild(row);
    });
    
    showScreen('screen6');
}

function updateProgress(ticketType, ticketNumber, percentage) {
    if (ticketType === 'medicine') {
        userProgress.medicine[`ticket${ticketNumber}`] = percentage;
        document.getElementById(`medicineTicket${ticketNumber}Percent`).textContent = `${percentage}%`;
        
        if (percentage === 100) {
            userProgress.tickets++;
            document.getElementById('ticketsCount').textContent = userProgress.tickets;
            
            if (userProgress.medicine.ticket1 === 100) {
                userProgress.chapters++;
                document.getElementById('chaptersCount').textContent = userProgress.chapters;
            }
        }
    } else if (ticketType === 'signs') {
        userProgress.signs[`ticket${ticketNumber}`] = percentage;
        document.getElementById(`signsTicket${ticketNumber}Percent`).textContent = `${percentage}%`;
        
        if (percentage === 100) {
            userProgress.tickets++;
            document.getElementById('ticketsCount').textContent = userProgress.tickets;
            
            if (userProgress.signs.ticket1 === 100) {
                userProgress.chapters++;
                document.getElementById('chaptersCount').textContent = userProgress.chapters;
            }
        }
    }
}

let timeLeft = 600;

function startTimer(duration) {
    timeLeft = duration;
    updateTimerDisplay();
    
    clearInterval(timerInterval);
    timerInterval = setInterval(() => {
        timeLeft--;
        updateTimerDisplay();
        
        if (timeLeft <= 0) {
            clearInterval(timerInterval);
            finishTest();
        }
    }, 1000);
}

function updateTimerDisplay() {
    const minutes = Math.floor(timeLeft / 60);
    const seconds = timeLeft % 60;
    document.getElementById('timer').textContent = 
        `${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
}

setupAvatarUpload();