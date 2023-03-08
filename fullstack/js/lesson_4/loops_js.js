let number = +prompt("enter a number");
for (let start = 1; start <= number; start++) {
  if (start === 3) {
    continue;
  } else if (start === 9) {
    break;
  }
  for (let columns = 1; columns <= start; columns++) {
    document.write(start);
  }
  document.write("<br/>");
}
