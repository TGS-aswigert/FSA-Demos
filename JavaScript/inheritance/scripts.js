class Alien {

  constructor(name, health) {
    this.name = name;
    this.health = health;
    this.position = [0, 0];
    this.enemies = [];
  }

  fly(direction, paces) {
    switch (direction) {
      case "up":
        this.position[1] += paces;
        break;
      case "right":
        this.position[0] += paces;
        break;
      case "down":
        this.position[1] -= paces;
        break;
      case "left":
        this.position[0] -= paces;
        break;
      default:
        console.log(`Error: ${direction} is not a valid direction.`);
    }
    console.log(`${this.name} moved ${direction} ${paces} spaces.`);
    this.enemies.forEach(enemy => {
      if (this.position[0] == enemy.position[0] && this.position[1] == enemy.position[1]) {
        console.log(`${this.name} is in the same position as ${enemy.name}.`);
        enemy.takeDamage();
      }
    });
  }

  takeDamage() {
    this.health -= 1;
    console.log(`${this.name} has been attacked! ${this.name}'s new health is ${this.health}.`);
  }

}

class Player {

  constructor(name) {
    this.name = name;
    this.health = 5;
    this.position = [5, 5];
    this.enemies = [];
  }

  walk(direction, paces) {
    switch (direction) {
      case "up":
        this.position[1] += paces;
        break;
      case "right":
        this.position[0] += paces;
        break;
      case "down":
        this.position[1] -= paces;
        break;
      case "left":
        this.position[0] -= paces;
        break;
      default:
        console.log(`Error: ${direction} is not a valid direction.`);
    }
    console.log(`${this.name} moved ${direction} ${paces} spaces.`);
    this.enemies.forEach(enemy => {
      if (this.position[0] == enemy.position[0] && this.position[1] == enemy.position[1]) {
        console.log(`${this.name} is in the same position as ${enemy.name}.`);
        enemy.takeDamage();
      }
    });
  }

  takeDamage() {
    this.health -= 1;
    console.log(`${this.name} has been attacked! ${this.name}'s new health is ${this.health}.`);
  }

  interactWith(item) {
    console.log(`${this.name} is interacting with a(n) ${item}.`);
  }
}

const alf = new Alien("Alf", 10);
const marty = new Player("Marty");
alf.enemies.push(marty);
marty.enemies.push(alf);

marty.walk("down", 5);
marty.walk("left", 5);

alf.fly("up", 2);
marty.walk("up", 1);
marty.interactWith("treasure chest");
alf.fly("down", 1);
alf.interactWith("treasure chest");