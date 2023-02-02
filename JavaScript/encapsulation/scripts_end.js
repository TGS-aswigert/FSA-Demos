
class Customer {
  #age;
  #ssn;

  constructor(name, age, ssn, email) {
    this.name = name;
    this.#age = age;
    this.#ssn = ssn;
    this.email = email;
  }

  setAge(age) {
    if (age < 0) {
      console.error("A customer's age cannot be less than 0.");
    } else {
      this.#age = age;
    }
  }

  getAge() {
    console.log(this.#age);
  }

}

const abigail = new Customer("Abigail", 26, "555-555-5555", "aswigert@teksystems.com");

console.log(abigail.name);
abigail.setAge(-26);
abigail.getAge();

// console.log(abigail.#ssn);