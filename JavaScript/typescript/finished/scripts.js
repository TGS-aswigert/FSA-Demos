var __classPrivateFieldSet = (this && this.__classPrivateFieldSet) || function (receiver, state, value, kind, f) {
    if (kind === "m") throw new TypeError("Private method is not writable");
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a setter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot write private member to an object whose class did not declare it");
    return (kind === "a" ? f.call(receiver, value) : f ? f.value = value : state.set(receiver, value)), value;
};
var __classPrivateFieldGet = (this && this.__classPrivateFieldGet) || function (receiver, state, kind, f) {
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a getter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot read private member from an object whose class did not declare it");
    return kind === "m" ? f : kind === "a" ? f.call(receiver) : f ? f.value : state.get(receiver);
};
var _Character_name, _Character_healthPoints, _Character_attackPower, _Player_weaponsList, _Enemy_weapon;
class Character {
    constructor(name, healthPoints, attackPower) {
        _Character_name.set(this, void 0);
        _Character_healthPoints.set(this, void 0);
        _Character_attackPower.set(this, void 0);
        __classPrivateFieldSet(this, _Character_name, name, "f");
        __classPrivateFieldSet(this, _Character_healthPoints, healthPoints, "f");
        __classPrivateFieldSet(this, _Character_attackPower, attackPower, "f");
    }
    getName() {
        return __classPrivateFieldGet(this, _Character_name, "f");
    }
    getHealthPoints() {
        return __classPrivateFieldGet(this, _Character_healthPoints, "f");
    }
    setHealthPoints(newHealthPoints) {
        __classPrivateFieldSet(this, _Character_healthPoints, newHealthPoints, "f");
    }
    getAttackPower() {
        return __classPrivateFieldGet(this, _Character_attackPower, "f");
    }
    attack(target, weapon) {
        target.setHealthPoints(target.getHealthPoints() - this.getAttackPower());
        console.log(`${this.getName()} attacked ${target.getName()} with a ${weapon}`);
    }
}
_Character_name = new WeakMap(), _Character_healthPoints = new WeakMap(), _Character_attackPower = new WeakMap();
class Player extends Character {
    constructor(name) {
        super(name, 100, 20);
        _Player_weaponsList.set(this, []);
        __classPrivateFieldGet(this, _Player_weaponsList, "f").push("Rusty Sword");
    }
    getWeaponsList() {
        return __classPrivateFieldGet(this, _Player_weaponsList, "f");
    }
    pickupWeapon(weapon) {
        this.getWeaponsList().push(weapon);
    }
}
_Player_weaponsList = new WeakMap();
class Enemy extends Character {
    constructor(name, weapon) {
        super(name, 100, 10);
        _Enemy_weapon.set(this, void 0);
        __classPrivateFieldSet(this, _Enemy_weapon, weapon, "f");
    }
    getWeapon() {
        return __classPrivateFieldGet(this, _Enemy_weapon, "f");
    }
    attack(target) {
        super.attack(target, __classPrivateFieldGet(this, _Enemy_weapon, "f"));
    }
}
_Enemy_weapon = new WeakMap();
const atreus = new Player("Atreus");
const heimdall = new Enemy("Heimdall", "Sword");
atreus.pickupWeapon("Bow and Arrow");
atreus.attack(heimdall, atreus.getWeaponsList().find(weapon => weapon = "Bow and Arrow"));
console.log(heimdall.getHealthPoints());
