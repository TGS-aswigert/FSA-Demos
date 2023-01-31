class Character {

  constructor(name, health, position) {
    this.name = name;
    this.health = health;
    this.position = position;
    this.enemies = [];
  }

  move(direction, paces) {
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

class Alien extends Character {

  constructor(name, health) {
    super(name, health, [0, 0]);
  }

}

class Player extends Character {

  constructor(name) {
    super(name, 5, [5, 5]);
  }

  interactWith(item) {
    console.log(`${this.name} is interacting with a(n) ${item}.`);
  }
}

const alf = new Alien("Alf", 10);
const marty = new Player("Marty");
alf.enemies.push(marty);
marty.enemies.push(alf);

marty.move("down", 5);
marty.move("left", 5);

alf.move("up", 2);
marty.move("up", 1);
marty.interactWith("treasure chest");
alf.move("down", 1);
alf.interactWith("treasure chest");