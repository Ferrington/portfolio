<template>
  <section class="hero">
    <h1><span>Hi, I'm</span> Christopher.</h1>
    <h2>I create automation solutions.</h2>
  </section>
</template>

<style>
.hero {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
  min-height: 100vh;
  max-width: 1000px;
}

.hero span {
  font-size: 1.5rem;
  color: var(--muted-text-color);
}

.hero h1 {
  font-size: 3.5rem;
}

.hero h2 {
  font-size: 3.5rem;
  color: var(--muted-text-color);
}
</style>
