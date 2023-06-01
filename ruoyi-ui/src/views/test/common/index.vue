<template>
  <div></div>
</template>

<script>
import { testFun } from "@/api/test/common/index.js";
export default {
  name: "test",
  data() {
    return {
      url: "ws://192.168.0.113:8888/websocket",
      protol: "",
      wsData: {
        token: "token-123456",
        data: "666",
      },
    };
  },
  mounted() {
    testFun(url, protol, wsData);
  },
};
</script>

<style>
</style>