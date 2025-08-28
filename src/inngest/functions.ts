import { inngest } from "./client";

export const testfunction = inngest.createFunction(
  { id: "oh shera function chal gya" },
  { event: "test/testfunction" },
  async ({ event, step }) => {
    await step.sleep("wait-a-moment", "1s");
    return { message: `Hello ${event.data.email}!` };
  },
);