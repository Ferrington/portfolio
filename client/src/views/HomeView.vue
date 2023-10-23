<script setup>
import ProjectList from '../components/home/ProjectList.vue'
import TheHero from '../components/home/TheHero.vue'
</script>

<template>
  <main class="main">
    <TheHero />
    <ProjectList />
  </main>
</template>

<style>
.main {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 0 auto;
  width: 100%;
  max-width: 1600px;
  gap: 50px;
}
</style>
