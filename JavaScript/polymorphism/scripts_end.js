class Student {
  #name;
  #classesAndGrades = [];

  constructor(name) {
    this.#name = name;
  }

  getName() {
    return this.#name;
  }

  getClassesAndGrades() {
    return this.#classesAndGrades;
  }

  getGPA() {
    let gpa = 0;
    this.#classesAndGrades.forEach(element => {
      switch (element.grade) {
        case "A":
          gpa += 4;
          break;
        case "B":
          gpa += 3;
          break;
        case "C":
          gpa += 2;
          break;
        case "D":
          gpa += 1;
          break;
        default:
          gpa += 0;
          break;
      }
    });
    gpa /= this.#classesAndGrades.length;
    return Math.round(gpa * 100) / 100;
  }

  addClassAndGrade(classAndGrade) {
    this.#classesAndGrades.push(classAndGrade);
  }

}

class APStudent extends Student {
  getGPA() {
    let gpa = 0;
    this.getClassesAndGrades().forEach(element => {
      switch (element.grade) {
        case "A":
          gpa += 5;
          break;
        case "B":
          gpa += 4;
          break;
        case "C":
          gpa += 3;
          break;
        case "D":
          gpa += 2;
          break;
        case "F":
          gpa += 1;
          break;
        default:
          gpa += 0;
          break;
      }
    });
    gpa /= this.getClassesAndGrades().length;
    return Math.round(gpa * 100) / 100;
  }
}

const stu = new APStudent("Stu");

stu.addClassAndGrade({
  class: "Econ",
  grade: "A"
});

stu.addClassAndGrade({
  class: "Math",
  grade: "C"
});

stu.addClassAndGrade({
  class: "Biology",
  grade: "D"
});

console.log(stu.getGPA());