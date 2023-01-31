class Alien {
  
  constructor(name, health) {
    this.name = name;
    this.health = health;
    this.position = [0,0]
  }

  fly(direction) {
    this.position[direction] += 1;
  }

  takeDamage() {
    this.health -=1;
  }
}

const alf = new Alien("ALF", 10);
const rose = new Alien("Rose Quartz", 10);
const et = new Alien("ET", 10);

alf.fly(1);
alf.takeDamage();

console.log(alf.health);
console.log(alf.position);