#Undirected graph
#This graph defines 4 students and uses edges to specify their relations i.e. hometown or university

graph(undirected) beginfunc
	#Vertex definitions
	vertex ertan;
	vertex arif;
	vertex furkan;
	vertex omer;

	#Edge definitions
	edge ankaraEdge;
	edge istanbulEdge;
	edge bilkentEdge;

	#Ankara
	property ankara;
	ankara = "ankara";

	#Istanbul
	property istanbul;
	istanbul = "istanbul";

	#Bilkent
	property bilkent;
	bilkent = "bilkent";

	#Omer's grades
	property grades;
	grades = {"cs202":{"homeworks":[70, 70, 83], "quizzes":[100, 100], "midterm":85, "final":97.3, "letterGrade":"A"}, ge100:"A"};

	#Adding edge properties
	ankaraEdge.addProperty("city", ankara);
	istanbulEdge.addProperty("city", istanbul);
	bilkentEdge.addProperty("university", bilkent);

	#Adding grades to omer
	omer.addProperty(grades);

	#Connecting vertices with edges
	connect(ertan, arif, istanbulEdge);
	connect(furkan, omer, ankaraEdge);
	connect(omer, arif, bilkentEdge);
endfunc

/* 
	Query 
			codes 
					would be 
								here...
											*/